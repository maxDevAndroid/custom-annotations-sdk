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

### How to Add dependency?

```kotlin
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url = uri("https://jitpack.io") }
		}
	}
```
**In your gradle module:**

```kotlin
	dependencies {
	        implementation("com.github.maxDevAndroid:custom-annotations-sdk:v1.0.0")
	}
```

