# The Assassin's Oath — Forge 1.20.1 (Source Template)

This is a **lightweight gameplay template** for your stealth add-on:
- Backstab damage when sneaking and striking from behind
- Smoke Bomb (AreaEffectCloud quick version)
- Ronin armor set (custom material)
- Minimal resources, en_US + zh_TW

## How to Run (merge with official MDK)
1. Download the official **Forge MDK 1.20.1**.
2. Unzip to a new folder, e.g. `AssassinsOath`.
3. Copy this template's **`src`** folder into the MDK folder, **overwriting** existing files.
4. From the MDK root:
   - Windows: `gradlew genIntellijRuns` (or `genEclipseRuns`) then `gradlew runClient`
   - macOS/Linux: `./gradlew genIntellijRuns` then `./gradlew runClient`

## Mod identifiers
- **Display Name**: The Assassin's Oath
- **Mod ID**: `assassinsoath` (lowercase, no underscore for cleaner resource paths)
- **Java package**: `com.yourname.assassinsoath`
- **Assets**: `assets/assassinsoath/...`

## Where to extend
- **Backstab tuning**: `event/BackstabHandler.java` (threshold, multiplier)
- **Smoke bomb**: convert to a thrown projectile later; adjust radius/duration/effects
- **Ronin armor**: tweak stats in `armor/RoninMaterial.java`; replace textures under `textures/models/armor`
- **More items/blocks**: add in `registry/ModItems.java` (and future `ModBlocks.java` if needed)

## Notes
- This template intentionally **omits Gradle files**; rely on the official MDK's build.
- Placeholder textures are simple PNGs so you can see items immediately; replace them with your art.
