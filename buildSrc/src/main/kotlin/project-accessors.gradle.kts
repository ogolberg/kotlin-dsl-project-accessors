import org.gradle.api.internal.AbstractNamedDomainObjectContainer
import org.gradle.api.internal.CollectionCallbackActionDecorator
import org.gradle.internal.reflect.DirectInstantiator
import org.gradle.kotlin.dsl.create

// NamedDomainObjectContainers get typesafe accessors
open class ProjectAccessorsExtension : AbstractNamedDomainObjectContainer<Project>(
    Project::class.java,
    DirectInstantiator.INSTANCE,
    Namer { p -> p.name },
    CollectionCallbackActionDecorator.NOOP
) {
    override fun doCreate(name: String) = error("unsupported")
}

// Project extensions get typesafe accessors
project.extensions.create<ProjectAccessorsExtension>("projects").addAll(project.rootProject.allprojects)
