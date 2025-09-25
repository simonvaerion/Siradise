/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.tags.DamageTypeTags
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 *  yesman.epicfight.api.animation.AnimationManager$AnimationAccessor
 *  yesman.epicfight.api.animation.property.AnimationProperty$AttackPhaseProperty
 *  yesman.epicfight.api.forgeevent.SkillBuildEvent
 *  yesman.epicfight.api.forgeevent.SkillBuildEvent$ModRegistryWorker
 *  yesman.epicfight.api.utils.math.ValueModifier
 *  yesman.epicfight.particle.EpicFightParticles
 *  yesman.epicfight.skill.AirAttack
 *  yesman.epicfight.skill.BasicAttack
 *  yesman.epicfight.skill.BattojutsuPassive
 *  yesman.epicfight.skill.Skill
 *  yesman.epicfight.skill.Skill$ActivateType
 *  yesman.epicfight.skill.Skill$Resource
 *  yesman.epicfight.skill.SkillBuilder
 *  yesman.epicfight.skill.SkillCategories
 *  yesman.epicfight.skill.SkillCategory
 *  yesman.epicfight.skill.dodge.DodgeSkill
 *  yesman.epicfight.skill.dodge.DodgeSkill$Builder
 *  yesman.epicfight.skill.dodge.KnockdownWakeupSkill
 *  yesman.epicfight.skill.guard.GuardSkill
 *  yesman.epicfight.skill.guard.ImpactGuardSkill
 *  yesman.epicfight.skill.guard.ParryingSkill
 *  yesman.epicfight.skill.identity.MeteorSlamSkill
 *  yesman.epicfight.skill.identity.RevelationSkill
 *  yesman.epicfight.skill.mover.DemolitionLeapSkill
 *  yesman.epicfight.skill.mover.PhantomAscentSkill
 *  yesman.epicfight.skill.passive.AdaptiveSkinSkill
 *  yesman.epicfight.skill.passive.AdrenalineFiendSkill
 *  yesman.epicfight.skill.passive.BerserkerSkill
 *  yesman.epicfight.skill.passive.BonebreakerSkill
 *  yesman.epicfight.skill.passive.CatharsisSkill
 *  yesman.epicfight.skill.passive.DeathHarvestSkill
 *  yesman.epicfight.skill.passive.EmergencyEscapeSkill
 *  yesman.epicfight.skill.passive.EnduranceSkill
 *  yesman.epicfight.skill.passive.ForbiddenStrengthSkill
 *  yesman.epicfight.skill.passive.HyperVitalitySkill
 *  yesman.epicfight.skill.passive.PassiveSkill
 *  yesman.epicfight.skill.passive.StaminaPillagerSkill
 *  yesman.epicfight.skill.passive.SwordmasterSkill
 *  yesman.epicfight.skill.passive.TechnicianSkill
 *  yesman.epicfight.skill.passive.VengeanceSkill
 *  yesman.epicfight.skill.weaponinnate.BattojutsuSkill
 *  yesman.epicfight.skill.weaponinnate.BladeRushSkill
 *  yesman.epicfight.skill.weaponinnate.ConditionalWeaponInnateSkill
 *  yesman.epicfight.skill.weaponinnate.EverlastingAllegiance
 *  yesman.epicfight.skill.weaponinnate.EviscerateSkill
 *  yesman.epicfight.skill.weaponinnate.GraspingSpireSkill
 *  yesman.epicfight.skill.weaponinnate.GuillotineAxeSkill
 *  yesman.epicfight.skill.weaponinnate.LiechtenauerSkill
 *  yesman.epicfight.skill.weaponinnate.RushingTempoSkill
 *  yesman.epicfight.skill.weaponinnate.SimpleWeaponInnateSkill
 *  yesman.epicfight.skill.weaponinnate.SteelWhirlwindSkill
 *  yesman.epicfight.skill.weaponinnate.WeaponInnateSkill
 *  yesman.epicfight.skill.weaponinnate.WrathfulLightingSkill
 *  yesman.epicfight.world.capabilities.item.CapabilityItem$WeaponCategories
 *  yesman.epicfight.world.capabilities.item.WeaponCategory
 *  yesman.epicfight.world.damagesource.EpicFightDamageTypeTags
 *  yesman.epicfight.world.damagesource.ExtraDamageInstance
 *  yesman.epicfight.world.damagesource.StunType
 */
package yesman.epicfight.gameasset;

import java.util.Set;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.DamageTypeTags;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import yesman.epicfight.api.animation.AnimationManager;
import yesman.epicfight.api.animation.property.AnimationProperty;
import yesman.epicfight.api.forgeevent.SkillBuildEvent;
import yesman.epicfight.api.utils.math.ValueModifier;
import yesman.epicfight.particle.EpicFightParticles;
import yesman.epicfight.skill.AirAttack;
import yesman.epicfight.skill.BasicAttack;
import yesman.epicfight.skill.BattojutsuPassive;
import yesman.epicfight.skill.Skill;
import yesman.epicfight.skill.SkillBuilder;
import yesman.epicfight.skill.SkillCategories;
import yesman.epicfight.skill.SkillCategory;
import yesman.epicfight.skill.dodge.DodgeSkill;
import yesman.epicfight.skill.dodge.KnockdownWakeupSkill;
import yesman.epicfight.skill.guard.GuardSkill;
import yesman.epicfight.skill.guard.ImpactGuardSkill;
import yesman.epicfight.skill.guard.ParryingSkill;
import yesman.epicfight.skill.identity.MeteorSlamSkill;
import yesman.epicfight.skill.identity.RevelationSkill;
import yesman.epicfight.skill.mover.DemolitionLeapSkill;
import yesman.epicfight.skill.mover.PhantomAscentSkill;
import yesman.epicfight.skill.passive.AdaptiveSkinSkill;
import yesman.epicfight.skill.passive.AdrenalineFiendSkill;
import yesman.epicfight.skill.passive.BerserkerSkill;
import yesman.epicfight.skill.passive.BonebreakerSkill;
import yesman.epicfight.skill.passive.CatharsisSkill;
import yesman.epicfight.skill.passive.DeathHarvestSkill;
import yesman.epicfight.skill.passive.EmergencyEscapeSkill;
import yesman.epicfight.skill.passive.EnduranceSkill;
import yesman.epicfight.skill.passive.ForbiddenStrengthSkill;
import yesman.epicfight.skill.passive.HyperVitalitySkill;
import yesman.epicfight.skill.passive.PassiveSkill;
import yesman.epicfight.skill.passive.StaminaPillagerSkill;
import yesman.epicfight.skill.passive.SwordmasterSkill;
import yesman.epicfight.skill.passive.TechnicianSkill;
import yesman.epicfight.skill.passive.VengeanceSkill;
import yesman.epicfight.skill.weaponinnate.BattojutsuSkill;
import yesman.epicfight.skill.weaponinnate.BladeRushSkill;
import yesman.epicfight.skill.weaponinnate.ConditionalWeaponInnateSkill;
import yesman.epicfight.skill.weaponinnate.EverlastingAllegiance;
import yesman.epicfight.skill.weaponinnate.EviscerateSkill;
import yesman.epicfight.skill.weaponinnate.GraspingSpireSkill;
import yesman.epicfight.skill.weaponinnate.GuillotineAxeSkill;
import yesman.epicfight.skill.weaponinnate.LiechtenauerSkill;
import yesman.epicfight.skill.weaponinnate.RushingTempoSkill;
import yesman.epicfight.skill.weaponinnate.SimpleWeaponInnateSkill;
import yesman.epicfight.skill.weaponinnate.SteelWhirlwindSkill;
import yesman.epicfight.skill.weaponinnate.WeaponInnateSkill;
import yesman.epicfight.skill.weaponinnate.WrathfulLightingSkill;
import yesman.epicfight.world.capabilities.item.CapabilityItem;
import yesman.epicfight.world.capabilities.item.WeaponCategory;
import yesman.epicfight.world.damagesource.EpicFightDamageTypeTags;
import yesman.epicfight.world.damagesource.ExtraDamageInstance;
import yesman.epicfight.world.damagesource.StunType;

@Mod.EventBusSubscriber(modid = "epicfight", bus = Mod.EventBusSubscriber.Bus.MOD)
public class EpicFightSkills {
  public static Skill BASIC_ATTACK;
  public static Skill AIR_ATTACK;
  public static Skill KNOCKDOWN_WAKEUP;
  public static Skill ROLL;
  public static Skill STEP;
  public static Skill GUARD;
  public static Skill PARRYING;
  public static Skill IMPACT_GUARD;
  public static Skill ADAPTIVE_SKIN;
  public static Skill ADRENALINE_FIEND;
  public static Skill BERSERKER;
  public static Skill BONEBREAKER;
  public static Skill CATHARSIS;
  public static Skill DEATH_HARVEST;
  public static Skill EMERGENCY_ESCAPE;
  public static Skill ENDURANCE;
  public static Skill FORBIDDEN_STRENGTH;
  public static Skill HYPERVITALITY;
  public static Skill STAMINA_PILLAGER;
  public static Skill SWORD_MASTER;
  public static Skill TECHNICIAN;
  public static Skill VENGEANCE;
  public static Skill GUILLOTINE_AXE;
  public static Skill SWEEPING_EDGE;
  public static Skill DANCING_EDGE;
  public static Skill GRASPING_SPIRE;
  public static Skill HEARTPIERCER;
  public static Skill STEEL_WHIRLWIND;
  public static Skill BATTOJUTSU;
  public static Skill BATTOJUTSU_PASSIVE;
  public static Skill RUSHING_TEMPO;
  public static Skill RELENTLESS_COMBO;
  public static Skill SHARP_STAB;
  public static Skill LIECHTENAUER;
  public static Skill EVISCERATE;
  public static Skill BLADE_RUSH;
  public static Skill WRATHFUL_LIGHTING;
  public static Skill TSUNAMI;
  public static Skill EVERLASTING_ALLEGIANCE;
  public static Skill METEOR_STRIKE;
  public static Skill REVELATION;
  public static Skill DEMOLITION_LEAP;
  public static Skill PHANTOM_ASCENT;

  @SubscribeEvent
  public static void buildSkillEvent(SkillBuildEvent build) {
    SkillBuildEvent.ModRegistryWorker modRegistry = build.createRegistryWorker("epicfight");
    BASIC_ATTACK =
        modRegistry.build("basic_attack", BasicAttack::new, BasicAttack.createBasicAttackBuilder());
    AIR_ATTACK =
        modRegistry.build("air_attack", AirAttack::new, AirAttack.createAirAttackBuilder());
    ROLL =
        modRegistry.build(
            "roll",
            DodgeSkill::new,
            (SkillBuilder)
                DodgeSkill.createDodgeBuilder()
                    .setAnimations(
                        new AnimationManager.AnimationAccessor[] {
                          Animations.BIPED_ROLL_FORWARD, Animations.BIPED_ROLL_BACKWARD
                        }));
    STEP =
        modRegistry.build(
            "step",
            DodgeSkill::new,
            (SkillBuilder)
                DodgeSkill.createDodgeBuilder()
                    .setAnimations(
                        new AnimationManager.AnimationAccessor[] {
                          Animations.BIPED_STEP_FORWARD,
                          Animations.BIPED_STEP_BACKWARD,
                          Animations.BIPED_STEP_LEFT,
                          Animations.BIPED_STEP_RIGHT
                        }));
    KNOCKDOWN_WAKEUP =
        modRegistry.build(
            "knockdown_wakeup",
            KnockdownWakeupSkill::new,
            (SkillBuilder)
                ((DodgeSkill.Builder)
                    DodgeSkill.createDodgeBuilder()
                        .setAnimations(
                            new AnimationManager.AnimationAccessor[] {
                              Animations.BIPED_KNOCKDOWN_WAKEUP_LEFT,
                              Animations.BIPED_KNOCKDOWN_WAKEUP_RIGHT
                            })
                        .setCategory((SkillCategory) SkillCategories.KNOCKDOWN_WAKEUP)));
    GUARD =
        modRegistry.build("guard", GuardSkill::new, (SkillBuilder) GuardSkill.createGuardBuilder());
    PARRYING =
        modRegistry.build(
            "parrying",
            ParryingSkill::new,
            (SkillBuilder) ParryingSkill.createActiveGuardBuilder());
    IMPACT_GUARD =
        modRegistry.build(
            "impact_guard",
            ImpactGuardSkill::new,
            (SkillBuilder) ImpactGuardSkill.createEnergizingGuardBuilder());
    ADAPTIVE_SKIN =
        modRegistry.build(
            "adaptive_skin",
            AdaptiveSkinSkill::new,
            (SkillBuilder) AdaptiveSkinSkill.createAdaptiveSkinBuilder());
    ADRENALINE_FIEND =
        modRegistry.build(
            "adrenaline_fiend", AdrenalineFiendSkill::new, PassiveSkill.createPassiveBuilder());
    BERSERKER =
        modRegistry.build("berserker", BerserkerSkill::new, PassiveSkill.createPassiveBuilder());
    BONEBREAKER =
        modRegistry.build(
            "bonebreaker", BonebreakerSkill::new, PassiveSkill.createPassiveBuilder());
    CATHARSIS =
        modRegistry.build("catharsis", CatharsisSkill::new, PassiveSkill.createPassiveBuilder());
    DEATH_HARVEST =
        modRegistry.build(
            "death_harvest", DeathHarvestSkill::new, PassiveSkill.createPassiveBuilder());
    EMERGENCY_ESCAPE =
        modRegistry.build(
            "emergency_escape",
            EmergencyEscapeSkill::new,
            (SkillBuilder)
                EmergencyEscapeSkill.createEmergencyEscapeBuilder()
                    .addAvailableWeaponCategory(
                        new WeaponCategory[] {
                          CapabilityItem.WeaponCategories.FIST,
                          CapabilityItem.WeaponCategories.SWORD,
                          CapabilityItem.WeaponCategories.UCHIGATANA,
                          CapabilityItem.WeaponCategories.DAGGER
                        }));
    ENDURANCE =
        modRegistry.build(
            "endurance",
            EnduranceSkill::new,
            PassiveSkill.createPassiveBuilder()
                .setResource(Skill.Resource.COOLDOWN)
                .setActivateType(Skill.ActivateType.DURATION));
    FORBIDDEN_STRENGTH =
        modRegistry.build(
            "forbidden_strength", ForbiddenStrengthSkill::new, PassiveSkill.createPassiveBuilder());
    HYPERVITALITY =
        modRegistry.build(
            "hypervitality",
            HyperVitalitySkill::new,
            PassiveSkill.createPassiveBuilder()
                .setResource(Skill.Resource.COOLDOWN)
                .setActivateType(Skill.ActivateType.TOGGLE));
    STAMINA_PILLAGER =
        modRegistry.build(
            "stamina_pillager", StaminaPillagerSkill::new, PassiveSkill.createPassiveBuilder());
    SWORD_MASTER =
        modRegistry.build(
            "swordmaster",
            SwordmasterSkill::new,
            (SkillBuilder) SwordmasterSkill.createSwordMasterBuilder());
    TECHNICIAN =
        modRegistry.build("technician", TechnicianSkill::new, PassiveSkill.createPassiveBuilder());
    VENGEANCE =
        modRegistry.build(
            "vengeance",
            VengeanceSkill::new,
            PassiveSkill.createPassiveBuilder().setActivateType(Skill.ActivateType.DURATION));
    METEOR_STRIKE =
        modRegistry.build(
            "meteor_slam",
            MeteorSlamSkill::new,
            (SkillBuilder) MeteorSlamSkill.createMeteorSlamBuilder());
    REVELATION =
        modRegistry.build(
            "revelation",
            RevelationSkill::new,
            (SkillBuilder) RevelationSkill.createRevelationSkillBuilder());
    DEMOLITION_LEAP =
        modRegistry.build(
            "demolition_leap",
            DemolitionLeapSkill::new,
            Skill.createMoverBuilder().setActivateType(Skill.ActivateType.HELD));
    PHANTOM_ASCENT =
        modRegistry.build(
            "phantom_ascent",
            PhantomAscentSkill::new,
            Skill.createMoverBuilder().setResource(Skill.Resource.COOLDOWN));
    WeaponInnateSkill sweepingEdge =
        (WeaponInnateSkill)
            modRegistry.build(
                "sweeping_edge",
                SimpleWeaponInnateSkill::new,
                (SkillBuilder)
                    SimpleWeaponInnateSkill.createSimpleWeaponInnateBuilder()
                        .setAnimations(Animations.SWEEPING_EDGE));
    sweepingEdge
        .newProperty()
        .addProperty(
            AnimationProperty.AttackPhaseProperty.MAX_STRIKES_MODIFIER,
            (Object) ValueModifier.adder((float) 1.0f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.DAMAGE_MODIFIER,
            (Object) ValueModifier.multiplier((float) 2.0f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.ARMOR_NEGATION_MODIFIER,
            (Object) ValueModifier.adder((float) 20.0f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.IMPACT_MODIFIER,
            (Object) ValueModifier.multiplier((float) 1.6f))
        .addProperty(AnimationProperty.AttackPhaseProperty.STUN_TYPE, (Object) StunType.LONG)
        .addProperty(
            AnimationProperty.AttackPhaseProperty.EXTRA_DAMAGE,
            Set.of(ExtraDamageInstance.SWEEPING_EDGE_ENCHANTMENT.create(new float[0])))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.SOURCE_TAG,
            Set.of(EpicFightDamageTypeTags.WEAPON_INNATE));
    SWEEPING_EDGE = sweepingEdge;
    WeaponInnateSkill dancingEdge =
        (WeaponInnateSkill)
            modRegistry.build(
                "dancing_edge",
                SimpleWeaponInnateSkill::new,
                (SkillBuilder)
                    SimpleWeaponInnateSkill.createSimpleWeaponInnateBuilder()
                        .setAnimations(Animations.DANCING_EDGE));
    dancingEdge
        .newProperty()
        .addProperty(
            AnimationProperty.AttackPhaseProperty.MAX_STRIKES_MODIFIER,
            (Object) ValueModifier.adder((float) 1.0f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.IMPACT_MODIFIER,
            (Object) ValueModifier.multiplier((float) 1.2f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.EXTRA_DAMAGE,
            Set.of(ExtraDamageInstance.SWEEPING_EDGE_ENCHANTMENT.create(new float[0])))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.SOURCE_TAG,
            Set.of(EpicFightDamageTypeTags.WEAPON_INNATE))
        .newProperty()
        .addProperty(
            AnimationProperty.AttackPhaseProperty.MAX_STRIKES_MODIFIER,
            (Object) ValueModifier.adder((float) 1.0f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.IMPACT_MODIFIER,
            (Object) ValueModifier.multiplier((float) 1.2f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.EXTRA_DAMAGE,
            Set.of(ExtraDamageInstance.SWEEPING_EDGE_ENCHANTMENT.create(new float[0])))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.SOURCE_TAG,
            Set.of(EpicFightDamageTypeTags.WEAPON_INNATE))
        .newProperty()
        .addProperty(
            AnimationProperty.AttackPhaseProperty.MAX_STRIKES_MODIFIER,
            (Object) ValueModifier.adder((float) 1.0f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.IMPACT_MODIFIER,
            (Object) ValueModifier.multiplier((float) 1.2f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.EXTRA_DAMAGE,
            Set.of(ExtraDamageInstance.SWEEPING_EDGE_ENCHANTMENT.create(new float[0])))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.SOURCE_TAG,
            Set.of(EpicFightDamageTypeTags.WEAPON_INNATE));
    DANCING_EDGE = dancingEdge;
    WeaponInnateSkill theGuillotine =
        (WeaponInnateSkill)
            modRegistry.build(
                "the_guillotine",
                GuillotineAxeSkill::new,
                (SkillBuilder)
                    SimpleWeaponInnateSkill.createSimpleWeaponInnateBuilder()
                        .setAnimations(Animations.THE_GUILLOTINE));
    theGuillotine
        .newProperty()
        .addProperty(
            AnimationProperty.AttackPhaseProperty.MAX_STRIKES_MODIFIER,
            (Object) ValueModifier.setter((float) 1.0f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.DAMAGE_MODIFIER,
            (Object) ValueModifier.multiplier((float) 2.5f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.ARMOR_NEGATION_MODIFIER,
            (Object) ValueModifier.adder((float) 20.0f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.IMPACT_MODIFIER,
            (Object) ValueModifier.multiplier((float) 2.0f))
        .addProperty(AnimationProperty.AttackPhaseProperty.STUN_TYPE, (Object) StunType.LONG)
        .addProperty(
            AnimationProperty.AttackPhaseProperty.EXTRA_DAMAGE,
            Set.of(ExtraDamageInstance.SWEEPING_EDGE_ENCHANTMENT.create(new float[0])))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.SOURCE_TAG,
            Set.of(EpicFightDamageTypeTags.WEAPON_INNATE));
    GUILLOTINE_AXE = theGuillotine;
    WeaponInnateSkill graspingSpire =
        (WeaponInnateSkill)
            modRegistry.build(
                "grasping_spire",
                GraspingSpireSkill::new,
                WeaponInnateSkill.createWeaponInnateBuilder());
    graspingSpire
        .newProperty()
        .addProperty(
            AnimationProperty.AttackPhaseProperty.MAX_STRIKES_MODIFIER,
            (Object) ValueModifier.setter((float) 3.0f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.EXTRA_DAMAGE,
            Set.of(ExtraDamageInstance.SWEEPING_EDGE_ENCHANTMENT.create(new float[0])))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.SOURCE_TAG,
            Set.of(EpicFightDamageTypeTags.WEAPON_INNATE))
        .addProperty(AnimationProperty.AttackPhaseProperty.STUN_TYPE, (Object) StunType.HOLD)
        .addProperty(
            AnimationProperty.AttackPhaseProperty.IMPACT_MODIFIER,
            (Object) ValueModifier.setter((float) 4.0f))
        .newProperty()
        .addProperty(
            AnimationProperty.AttackPhaseProperty.MAX_STRIKES_MODIFIER,
            (Object) ValueModifier.adder((float) 4.0f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.DAMAGE_MODIFIER,
            (Object) ValueModifier.multiplier((float) 1.25f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.IMPACT_MODIFIER,
            (Object) ValueModifier.multiplier((float) 1.2f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.EXTRA_DAMAGE,
            Set.of(ExtraDamageInstance.SWEEPING_EDGE_ENCHANTMENT.create(new float[0])))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.SOURCE_TAG,
            Set.of(EpicFightDamageTypeTags.WEAPON_INNATE));
    GRASPING_SPIRE = graspingSpire;
    WeaponInnateSkill heartpiercer =
        (WeaponInnateSkill)
            modRegistry.build(
                "heartpiercer",
                SimpleWeaponInnateSkill::new,
                (SkillBuilder)
                    SimpleWeaponInnateSkill.createSimpleWeaponInnateBuilder()
                        .setAnimations(Animations.HEARTPIERCER));
    heartpiercer
        .newProperty()
        .addProperty(
            AnimationProperty.AttackPhaseProperty.ARMOR_NEGATION_MODIFIER,
            (Object) ValueModifier.adder((float) 10.0f))
        .addProperty(AnimationProperty.AttackPhaseProperty.STUN_TYPE, (Object) StunType.HOLD)
        .addProperty(
            AnimationProperty.AttackPhaseProperty.EXTRA_DAMAGE,
            Set.of(ExtraDamageInstance.SWEEPING_EDGE_ENCHANTMENT.create(new float[0])))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.SOURCE_TAG,
            Set.of(EpicFightDamageTypeTags.WEAPON_INNATE));
    HEARTPIERCER = heartpiercer;
    WeaponInnateSkill steelWhirlwind =
        (WeaponInnateSkill)
            modRegistry.build(
                "steel_whirlwind",
                SteelWhirlwindSkill::new,
                WeaponInnateSkill.createWeaponInnateBuilder()
                    .setActivateType(Skill.ActivateType.HELD));
    steelWhirlwind
        .newProperty()
        .addProperty(
            AnimationProperty.AttackPhaseProperty.IMPACT_MODIFIER,
            (Object) ValueModifier.multiplier((float) 1.4f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.EXTRA_DAMAGE,
            Set.of(ExtraDamageInstance.SWEEPING_EDGE_ENCHANTMENT.create(new float[0])))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.SOURCE_TAG,
            Set.of(EpicFightDamageTypeTags.WEAPON_INNATE));
    STEEL_WHIRLWIND = steelWhirlwind;
    BATTOJUTSU_PASSIVE =
        modRegistry.build(
            "battojutsu_passive",
            BattojutsuPassive::new,
            Skill.createBuilder()
                .setCategory((SkillCategory) SkillCategories.WEAPON_PASSIVE)
                .setActivateType(Skill.ActivateType.ONE_SHOT)
                .setResource(Skill.Resource.COOLDOWN));
    WeaponInnateSkill battojutsu =
        (WeaponInnateSkill)
            modRegistry.build(
                "battojutsu",
                BattojutsuSkill::new,
                (SkillBuilder)
                    ConditionalWeaponInnateSkill.createConditionalWeaponInnateBuilder()
                        .setSelector(
                            executor -> ((ServerPlayer) executor.getOriginal()).m_20142_() ? 1 : 0)
                        .setAnimations(
                            new AnimationManager.AnimationAccessor[] {
                              Animations.BATTOJUTSU, Animations.BATTOJUTSU_DASH
                            }));
    battojutsu
        .newProperty()
        .addProperty(
            AnimationProperty.AttackPhaseProperty.DAMAGE_MODIFIER,
            (Object) ValueModifier.multiplier((float) 2.0f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.ARMOR_NEGATION_MODIFIER,
            (Object) ValueModifier.adder((float) 50.0f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.MAX_STRIKES_MODIFIER,
            (Object) ValueModifier.adder((float) 6.0f))
        .addProperty(AnimationProperty.AttackPhaseProperty.STUN_TYPE, (Object) StunType.HOLD)
        .addProperty(
            AnimationProperty.AttackPhaseProperty.EXTRA_DAMAGE,
            Set.of(ExtraDamageInstance.SWEEPING_EDGE_ENCHANTMENT.create(new float[0])))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.SOURCE_TAG,
            Set.of(EpicFightDamageTypeTags.WEAPON_INNATE));
    BATTOJUTSU = battojutsu;
    WeaponInnateSkill rushingTempo =
        (WeaponInnateSkill)
            modRegistry.build(
                "rushing_tempo",
                RushingTempoSkill::new,
                WeaponInnateSkill.createWeaponInnateBuilder());
    rushingTempo
        .newProperty()
        .addProperty(
            AnimationProperty.AttackPhaseProperty.ARMOR_NEGATION_MODIFIER,
            (Object) ValueModifier.adder((float) 50.0f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.MAX_STRIKES_MODIFIER,
            (Object) ValueModifier.adder((float) 2.0f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.DAMAGE_MODIFIER,
            (Object) ValueModifier.multiplier((float) 1.7f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.SWING_SOUND,
            (Object) ((SoundEvent) EpicFightSounds.WHOOSH_SHARP.get()))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.EXTRA_DAMAGE,
            Set.of(ExtraDamageInstance.SWEEPING_EDGE_ENCHANTMENT.create(new float[0])))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.SOURCE_TAG,
            Set.of(EpicFightDamageTypeTags.WEAPON_INNATE))
        .addProperty(AnimationProperty.AttackPhaseProperty.STUN_TYPE, (Object) StunType.HOLD);
    RUSHING_TEMPO = rushingTempo;
    WeaponInnateSkill relentlessCombo =
        (WeaponInnateSkill)
            modRegistry.build(
                "relentless_combo",
                SimpleWeaponInnateSkill::new,
                (SkillBuilder)
                    SimpleWeaponInnateSkill.createSimpleWeaponInnateBuilder()
                        .setAnimations(Animations.RELENTLESS_COMBO));
    relentlessCombo
        .newProperty()
        .addProperty(
            AnimationProperty.AttackPhaseProperty.DAMAGE_MODIFIER,
            (Object) ValueModifier.multiplier((float) 0.6f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.MAX_STRIKES_MODIFIER,
            (Object) ValueModifier.setter((float) 1.0f))
        .addProperty(AnimationProperty.AttackPhaseProperty.STUN_TYPE, (Object) StunType.HOLD)
        .addProperty(
            AnimationProperty.AttackPhaseProperty.PARTICLE, (Object) EpicFightParticles.HIT_BLUNT)
        .addProperty(
            AnimationProperty.AttackPhaseProperty.EXTRA_DAMAGE,
            Set.of(ExtraDamageInstance.SWEEPING_EDGE_ENCHANTMENT.create(new float[0])))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.SOURCE_TAG,
            Set.of(EpicFightDamageTypeTags.WEAPON_INNATE));
    RELENTLESS_COMBO = relentlessCombo;
    WeaponInnateSkill sharpStab =
        (WeaponInnateSkill)
            modRegistry.build(
                "sharp_stab",
                SimpleWeaponInnateSkill::new,
                (SkillBuilder)
                    SimpleWeaponInnateSkill.createSimpleWeaponInnateBuilder()
                        .setAnimations(Animations.SHARP_STAB));
    sharpStab
        .newProperty()
        .addProperty(
            AnimationProperty.AttackPhaseProperty.DAMAGE_MODIFIER,
            (Object) ValueModifier.multiplier((float) 0.4f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.IMPACT_MODIFIER,
            (Object) ValueModifier.multiplier((float) 0.5f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.PARTICLE, (Object) EpicFightParticles.HIT_BLUNT)
        .addProperty(
            AnimationProperty.AttackPhaseProperty.EXTRA_DAMAGE,
            Set.of(ExtraDamageInstance.SWEEPING_EDGE_ENCHANTMENT.create(new float[0])))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.SOURCE_TAG,
            Set.of(EpicFightDamageTypeTags.WEAPON_INNATE, EpicFightDamageTypeTags.GUARD_PUNCTURE));
    SHARP_STAB = sharpStab;
    LIECHTENAUER =
        modRegistry.build(
            "liechtenauer",
            LiechtenauerSkill::new,
            WeaponInnateSkill.createWeaponInnateBuilder()
                .setActivateType(Skill.ActivateType.DURATION));
    WeaponInnateSkill eviscerate =
        (WeaponInnateSkill)
            modRegistry.build(
                "eviscerate", EviscerateSkill::new, WeaponInnateSkill.createWeaponInnateBuilder());
    eviscerate
        .newProperty()
        .addProperty(
            AnimationProperty.AttackPhaseProperty.MAX_STRIKES_MODIFIER,
            (Object) ValueModifier.setter((float) 1.0f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.IMPACT_MODIFIER,
            (Object) ValueModifier.setter((float) 2.0f))
        .addProperty(AnimationProperty.AttackPhaseProperty.STUN_TYPE, (Object) StunType.HOLD)
        .addProperty(
            AnimationProperty.AttackPhaseProperty.SOURCE_TAG,
            Set.of(EpicFightDamageTypeTags.WEAPON_INNATE))
        .newProperty()
        .addProperty(
            AnimationProperty.AttackPhaseProperty.MAX_STRIKES_MODIFIER,
            (Object) ValueModifier.setter((float) 1.0f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.EXTRA_DAMAGE,
            Set.of(
                ExtraDamageInstance.SWEEPING_EDGE_ENCHANTMENT.create(new float[0]),
                ExtraDamageInstance.EVISCERATE_LOST_HEALTH.create(new float[] {0.1f})))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.SOURCE_TAG,
            Set.of(EpicFightDamageTypeTags.WEAPON_INNATE))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.ARMOR_NEGATION_MODIFIER,
            (Object) ValueModifier.adder((float) 50.0f))
        .addProperty(AnimationProperty.AttackPhaseProperty.STUN_TYPE, (Object) StunType.LONG);
    EVISCERATE = eviscerate;
    WeaponInnateSkill bladeRush =
        (WeaponInnateSkill)
            modRegistry.build(
                "blade_rush",
                BladeRushSkill::new,
                (SkillBuilder) BladeRushSkill.createBladeRushBuilder());
    bladeRush
        .newProperty()
        .addProperty(
            AnimationProperty.AttackPhaseProperty.MAX_STRIKES_MODIFIER,
            (Object) ValueModifier.setter((float) 1.0f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.EXTRA_DAMAGE,
            Set.of(ExtraDamageInstance.SWEEPING_EDGE_ENCHANTMENT.create(new float[0])))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.SOURCE_TAG,
            Set.of(EpicFightDamageTypeTags.WEAPON_INNATE))
        .newProperty()
        .addProperty(
            AnimationProperty.AttackPhaseProperty.SOURCE_TAG,
            Set.of(
                EpicFightDamageTypeTags.EXECUTION,
                EpicFightDamageTypeTags.WEAPON_INNATE,
                DamageTypeTags.f_268490_))
        .addProperty(AnimationProperty.AttackPhaseProperty.STUN_TYPE, (Object) StunType.NONE)
        .addProperty(
            AnimationProperty.AttackPhaseProperty.HIT_SOUND,
            (Object) ((SoundEvent) EpicFightSounds.BLADE_RUSH_FINISHER.get()));
    BLADE_RUSH = bladeRush;
    WeaponInnateSkill wrathfulLighting =
        (WeaponInnateSkill)
            modRegistry.build(
                "wrathful_lighting",
                WrathfulLightingSkill::new,
                (SkillBuilder)
                    SimpleWeaponInnateSkill.createSimpleWeaponInnateBuilder()
                        .setAnimations(Animations.WRATHFUL_LIGHTING));
    wrathfulLighting
        .newProperty()
        .addProperty(
            AnimationProperty.AttackPhaseProperty.MAX_STRIKES_MODIFIER,
            (Object) ValueModifier.setter((float) 1.0f))
        .newProperty()
        .addProperty(
            AnimationProperty.AttackPhaseProperty.DAMAGE_MODIFIER,
            (Object) ValueModifier.setter((float) 8.0f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.MAX_STRIKES_MODIFIER,
            (Object) ValueModifier.setter((float) 3.0f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.EXTRA_DAMAGE,
            Set.of(ExtraDamageInstance.SWEEPING_EDGE_ENCHANTMENT.create(new float[0])))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.ARMOR_NEGATION_MODIFIER,
            (Object) ValueModifier.adder((float) 100.0f))
        .addProperty(AnimationProperty.AttackPhaseProperty.STUN_TYPE, (Object) StunType.KNOCKDOWN)
        .addProperty(
            AnimationProperty.AttackPhaseProperty.SOURCE_TAG,
            Set.of(EpicFightDamageTypeTags.WEAPON_INNATE));
    WRATHFUL_LIGHTING = wrathfulLighting;
    WeaponInnateSkill tsunami =
        (WeaponInnateSkill)
            modRegistry.build(
                "tsunami",
                ConditionalWeaponInnateSkill::new,
                (SkillBuilder)
                    ConditionalWeaponInnateSkill.createConditionalWeaponInnateBuilder()
                        .setSelector(
                            executor -> ((ServerPlayer) executor.getOriginal()).m_20070_() ? 1 : 0)
                        .setAnimations(
                            new AnimationManager.AnimationAccessor[] {
                              Animations.TSUNAMI, Animations.TSUNAMI_REINFORCED
                            }));
    tsunami
        .newProperty()
        .addProperty(
            AnimationProperty.AttackPhaseProperty.ARMOR_NEGATION_MODIFIER,
            (Object) ValueModifier.adder((float) 100.0f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.SOURCE_TAG,
            Set.of(EpicFightDamageTypeTags.WEAPON_INNATE))
        .addProperty(AnimationProperty.AttackPhaseProperty.STUN_TYPE, (Object) StunType.KNOCKDOWN);
    TSUNAMI = tsunami;
    WeaponInnateSkill everlastAllegiance =
        (WeaponInnateSkill)
            modRegistry.build(
                "everlasting_allegiance",
                EverlastingAllegiance::new,
                WeaponInnateSkill.createWeaponInnateBuilder());
    everlastAllegiance
        .newProperty()
        .addProperty(
            AnimationProperty.AttackPhaseProperty.ARMOR_NEGATION_MODIFIER,
            (Object) ValueModifier.adder((float) 30.0f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.DAMAGE_MODIFIER,
            (Object) ValueModifier.multiplier((float) 1.4f))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.EXTRA_DAMAGE,
            Set.of(ExtraDamageInstance.SWEEPING_EDGE_ENCHANTMENT.create(new float[0])))
        .addProperty(
            AnimationProperty.AttackPhaseProperty.SOURCE_TAG,
            Set.of(EpicFightDamageTypeTags.WEAPON_INNATE))
        .addProperty(AnimationProperty.AttackPhaseProperty.STUN_TYPE, (Object) StunType.HOLD);
    EVERLASTING_ALLEGIANCE = everlastAllegiance;
  }

  private EpicFightSkills() {}
}
