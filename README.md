(Mis)uses Gradle's [typesafe accessors](https://docs.gradle.org/current/userguide/kotlin_dsl.html#type-safe-accessors) to let you write `projects.foo` instead of `project(":foo")`. 

[Example](myimpl/build.gradle.kts#L3).

[Implementation](buildSrc/src/main/kotlin/project-accessors.gradle.kts).
