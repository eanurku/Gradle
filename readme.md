Sr. No. 	Command 	Description
1 	gradle –q help –task <task name> 	Provides the usage information (such as path, type, description, group) about a specific task or multiple tasks.
2 	gradle –q dependencies 	Provides a list of dependencies of the selected project.
3 	gradle -q api:dependencies --configuration <task name> 	Provides the list of limited dependencies respective to configuration.
4 	gradle –q buildEnvironment 	Provides the list of build script dependencies.
5 	gradle –q dependencyInsight 	Provides an insight into a particular dependency.
6 	Gradle –q properties 	Provides the list of properties of the selected project.

gradle tasks

gradle build --refresh-dependecies
gradle build --dry-run
gradle dependencies --configuration runtime/compiletime

gradle {subproject}:dependencies --configuration runtime/compiletime

run task in subprojects:
ex:gradle :Gradle19_DirectDependenciesOnJarOrZip:clean build 

Define settings.gradle file for project with multiple modules:

settings.gradle
---------------
rootProject.name='TopLevelProject'
include 'subproject1' ,
         'subproject2',
         'subproject3'
---------------
