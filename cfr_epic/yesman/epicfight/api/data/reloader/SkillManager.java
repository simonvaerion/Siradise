/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  net.minecraft.core.Registry
 *  net.minecraft.nbt.CompoundTag
 *  net.minecraft.nbt.TagParser
 *  net.minecraft.resources.ResourceKey
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.packs.resources.ResourceManager
 *  net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener
 *  net.minecraft.util.ExtraCodecs
 *  net.minecraft.util.profiling.ProfilerFiller
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.api.distmarker.OnlyIn
 *  net.minecraftforge.eventbus.api.Event
 *  net.minecraftforge.fml.ModLoader
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.IForgeRegistry$BakeCallback
 *  net.minecraftforge.registries.IForgeRegistry$ClearCallback
 *  net.minecraftforge.registries.IForgeRegistry$CreateCallback
 *  net.minecraftforge.registries.IForgeRegistryInternal
 *  net.minecraftforge.registries.NewRegistryEvent
 *  net.minecraftforge.registries.RegisterEvent
 *  net.minecraftforge.registries.RegistryBuilder
 *  net.minecraftforge.registries.RegistryManager
 *  yesman.epicfight.api.forgeevent.SkillBuildEvent
 *  yesman.epicfight.client.ClientEngine
 *  yesman.epicfight.client.world.capabilites.entitypatch.player.LocalPlayerPatch
 *  yesman.epicfight.gameasset.EpicFightSkills
 *  yesman.epicfight.main.EpicFightMod
 *  yesman.epicfight.network.server.SPDatapackSync
 *  yesman.epicfight.skill.Skill
 *  yesman.epicfight.skill.SkillSlot
 *  yesman.epicfight.skill.SkillSlots
 *  yesman.epicfight.world.capabilities.skill.CapabilitySkill
 */
package yesman.epicfight.api.data.reloader;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.minecraft.core.Registry;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.TagParser;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.util.ExtraCodecs;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.fml.ModLoader;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryInternal;
import net.minecraftforge.registries.NewRegistryEvent;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryBuilder;
import net.minecraftforge.registries.RegistryManager;
import yesman.epicfight.api.forgeevent.SkillBuildEvent;
import yesman.epicfight.client.ClientEngine;
import yesman.epicfight.client.world.capabilites.entitypatch.player.LocalPlayerPatch;
import yesman.epicfight.gameasset.EpicFightSkills;
import yesman.epicfight.main.EpicFightMod;
import yesman.epicfight.network.server.SPDatapackSync;
import yesman.epicfight.skill.Skill;
import yesman.epicfight.skill.SkillSlot;
import yesman.epicfight.skill.SkillSlots;
import yesman.epicfight.world.capabilities.skill.CapabilitySkill;

public class SkillManager extends SimpleJsonResourceReloadListener {
  public static final ResourceKey<Registry<Skill>> SKILL_REGISTRY_KEY =
      ResourceKey.m_135788_(
          (ResourceLocation)
              ResourceLocation.fromNamespaceAndPath((String) "epicfight", (String) "skill"));
  public static final Codec<Skill> CODEC =
      ExtraCodecs.m_184415_(
          () -> RegistryManager.ACTIVE.getRegistry(SKILL_REGISTRY_KEY).getCodec());
  private static final List<CompoundTag> SKILL_PARAMS = Lists.newArrayList();
  private static final Gson GSON = new GsonBuilder().create();
  private static Set<String> namespaces;
  private static final SkillManager INSTANCE;

  public static List<CompoundTag> getSkillParams() {
    return Collections.unmodifiableList(SKILL_PARAMS);
  }

  public static void createSkillRegistry(NewRegistryEvent event) {
    event.create(
        RegistryBuilder.of(
                (ResourceLocation)
                    ResourceLocation.fromNamespaceAndPath((String) "epicfight", (String) "skill"))
            .addCallback((Object) SkillRegistryCallbacks.INSTANCE));
  }

  public static void registerSkills(RegisterEvent event) {
    if (event.getRegistryKey().equals(SKILL_REGISTRY_KEY)) {
      SkillBuildEvent skillBuildEvnet = new SkillBuildEvent();
      ModLoader.get().postEvent((Event) skillBuildEvnet);
      namespaces = ImmutableSet.copyOf((Collection) skillBuildEvnet.getNamespaces());
      event.register(
          SKILL_REGISTRY_KEY,
          helper ->
              skillBuildEvnet
                  .getAllSkills()
                  .forEach(skill -> helper.register(skill.getRegistryName(), skill)));
    }
  }

  public static Skill getSkill(String name) {
    ResourceLocation rl;
    IForgeRegistry<Skill> skillRegistry = SkillManager.getSkillRegistry();
    if (skillRegistry.containsKey(
        rl =
            name.indexOf(58) >= 0
                ? ResourceLocation.parse((String) name)
                : ResourceLocation.fromNamespaceAndPath((String) "epicfight", (String) name))) {
      return (Skill) skillRegistry.getValue(rl);
    }
    return null;
  }

  public static Collection<Skill> getSkills(Predicate<Skill> predicate) {
    return SkillManager.getSkillRegistry().getValues().stream()
        .filter(skill -> predicate.test((Skill) skill))
        .toList();
  }

  public static Stream<ResourceLocation> getSkillNames(Predicate<Skill> predicate) {
    return SkillManager.getSkillRegistry().getValues().stream()
        .filter(skill -> predicate.test((Skill) skill))
        .map(skill -> skill.getRegistryName());
  }

  public static Set<String> getNamespaces() {
    return namespaces;
  }

  public static void reloadAllSkillsAnimations() {
    IForgeRegistry<Skill> skillRegistry = SkillManager.getSkillRegistry();
    skillRegistry.getValues().forEach(skill -> skill.registerPropertiesToAnimation());
  }

  public static IForgeRegistry<Skill> getSkillRegistry() {
    return RegistryManager.ACTIVE.getRegistry(SKILL_REGISTRY_KEY);
  }

  @OnlyIn(value = Dist.CLIENT)
  public static void processServerPacket(SPDatapackSync packet) {
    IForgeRegistry<Skill> skillRegistry = SkillManager.getSkillRegistry();
    for (CompoundTag tag : packet.getTags()) {
      if (!skillRegistry.containsKey(ResourceLocation.parse((String) tag.m_128461_("id")))) {
        EpicFightMod.LOGGER.warn("Failed to syncronize Datapack for skill: " + tag.m_128461_("id"));
        continue;
      }
      ((Skill) skillRegistry.getValue(ResourceLocation.parse((String) tag.m_128461_("id"))))
          .setParams(tag);
    }
    LocalPlayerPatch localplayerpatch = ClientEngine.getInstance().getPlayerPatch();
    if (localplayerpatch != null) {
      CapabilitySkill skillCapability = localplayerpatch.getSkillCapability();
      skillCapability
          .listSkillContainers()
          .forEach(
              skillContainer -> {
                if (skillContainer.getSkill() != null) {
                  skillContainer.setSkill(
                      SkillManager.getSkill(skillContainer.getSkill().toString()), true);
                }
              });
      skillCapability
          .getSkillContainerFor((SkillSlot) SkillSlots.BASIC_ATTACK)
          .setSkill(EpicFightSkills.BASIC_ATTACK);
      skillCapability
          .getSkillContainerFor((SkillSlot) SkillSlots.AIR_ATTACK)
          .setSkill(EpicFightSkills.AIR_ATTACK);
      skillCapability
          .getSkillContainerFor((SkillSlot) SkillSlots.KNOCKDOWN_WAKEUP)
          .setSkill(EpicFightSkills.KNOCKDOWN_WAKEUP);
    }
  }

  private static Pair<ResourceLocation, CompoundTag> parseParameters(
      Map.Entry<ResourceLocation, JsonElement> entry) {
    try {
      CompoundTag tag = TagParser.m_129359_((String) entry.getValue().toString());
      tag.m_128359_("id", entry.getKey().toString());
      SKILL_PARAMS.add(tag);
      return Pair.of((Object) entry.getKey(), (Object) tag);
    } catch (CommandSyntaxException e) {
      EpicFightMod.LOGGER.warn(
          "Can't parse skill parameter for " + entry.getKey() + " because of " + e.getMessage());
      e.printStackTrace();
      return Pair.of((Object) entry.getKey(), (Object) new CompoundTag());
    }
  }

  public static SkillManager getInstance() {
    return INSTANCE;
  }

  public SkillManager() {
    super(GSON, "skill_parameters");
  }

  protected void apply(
      Map<ResourceLocation, JsonElement> objectIn,
      ResourceManager resourceManager,
      ProfilerFiller profileFiller) {
    IForgeRegistry<Skill> skillRegistry = SkillManager.getSkillRegistry();
    SKILL_PARAMS.clear();
    objectIn.entrySet().stream()
        .filter(
            entry -> {
              if (!skillRegistry.containsKey((ResourceLocation) entry.getKey())) {
                EpicFightMod.LOGGER.warn(
                    "Skill " + entry.getKey() + " doesn't exist in the registry.");
                return false;
              }
              return true;
            })
        .map(SkillManager::parseParameters)
        .forEach(
            pair ->
                ((Skill) skillRegistry.getValue((ResourceLocation) pair.getFirst()))
                    .setParams((CompoundTag) pair.getSecond()));
  }

  static {
    INSTANCE = new SkillManager();
  }

  private static class SkillRegistryCallbacks
      implements IForgeRegistry.BakeCallback<Skill>,
          IForgeRegistry.CreateCallback<Skill>,
          IForgeRegistry.ClearCallback<Skill> {
    private static final ResourceLocation LEARNABLE_SKILLS =
        ResourceLocation.fromNamespaceAndPath((String) "epicfight", (String) "learnableskills");
    private static final SkillRegistryCallbacks INSTANCE = new SkillRegistryCallbacks();

    private SkillRegistryCallbacks() {}

    public void onBake(IForgeRegistryInternal<Skill> owner, RegistryManager stage) {
      Map learnableSkills = (Map) owner.getSlaveMap(LEARNABLE_SKILLS, Map.class);
      owner.getEntries().stream()
          .filter(entry -> ((Skill) entry.getValue()).getCategory().learnable())
          .forEach(
              entry ->
                  learnableSkills.put(
                      ((ResourceKey) entry.getKey()).m_135782_(), (Skill) entry.getValue()));
    }

    public void onCreate(IForgeRegistryInternal<Skill> owner, RegistryManager stage) {
      owner.setSlaveMap(LEARNABLE_SKILLS, (Object) Maps.newHashMap());
    }

    public void onClear(IForgeRegistryInternal<Skill> owner, RegistryManager stage) {
      ((Map) owner.getSlaveMap(LEARNABLE_SKILLS, Map.class)).clear();
    }
  }
}
