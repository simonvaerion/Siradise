# Assassin's Oath Reconstruction

This repository contains a clean-room recreation of the sources and assets that
shipped inside `assassinsoath-0.1.0.jar`.  A complete Forge Gradle setup is now
part of the project so the mod can be built directly from this tree.

## Prerequisites

- **JDK 17** – Forge 1.20.1 targets Java 17. Running the Gradle wrapper with a
  newer JDK (for example Java 21) will trigger errors such as
  `Unsupported class file major version 65`. Point `JAVA_HOME` at a JDK 17
  installation before invoking any Gradle tasks, e.g.

  ```bash
  export JAVA_HOME="/path/to/jdk-17"
  export PATH="$JAVA_HOME/bin:$PATH"
  ```

- **Epic Fight (runtime)** – minimal API stubs are bundled so the sources build
  without the actual mod, but the real Epic Fight jar still needs to be present
  in your Minecraft instance (or the dev `run/mods` directory) at runtime.

## Building the mod

The Gradle wrapper downloads everything the first time it is executed. Run a
full build with:

```bash
./gradlew build --console=plain
```

On success the re-obfuscated jar appears at `build/libs/assassinsoath-0.1.0.jar`.

## Useful development tasks

- `./gradlew genIntellijRuns` / `./gradlew genEclipseRuns` – generate IDE run
  configurations for the client and server targets.
- `./gradlew clean` – remove the `build/` directory and cached artifacts.

## Troubleshooting

- **Gradle reports `Unsupported class file major version 65`** – ensure the
  wrapper is running on Java 17. Export `JAVA_HOME` as shown above and re-run the
  command.
- **Missing Epic Fight classes at runtime** – copy the actual Epic Fight mod jar
  into `run/mods` (development) or your Minecraft instance's `mods` folder.
