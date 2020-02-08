script plugin
--------------------
apply from: 'other.gradle'

binary plugin
---------------
apply plugin: 'Pluginname'

or 

plugins {
   id 'java'
}

community plugins:
plugins {
   id "com.jfrog.bintray" version "0.4.1"
}

-------------
gradle tasks
see all tasks as part of plugins