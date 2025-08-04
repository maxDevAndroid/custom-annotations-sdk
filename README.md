# Kotlin Annotations

Set of utility annotations for modularizing status, tracing, security, debugging, and API evolution markup.

### Categories:

| Annotation         | Purpose                         |
|--------------------|------------------------------------|
| `@LegacyApi`       | Flag legacy APIs (opt-in required) |
| `@ExperimentalApi` | Unstable APIs                    |
| `@PlannedFeature`  | Features in development       |
| `@InternalOnly`    | For internal use only        |
| `@DebugOnly`       | For debug builds only               |
| `@SensitiveApi`    | Requires encryption or care     |
| `@TrackingApi`     | Mark tracking events     |
| `@Obsolete`        | Obsolete, superseded             |

### UseCase:

```kotlin
@OptIn(LegacyApi::class)
@LegacyApi
fun oldApi() {}

@PlannedFeature("It will be released in the 4th quarter")
fun newFunction() {}
