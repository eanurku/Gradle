publish task:

anurag@anurag-X541UAK:~/anuragGit/Gradle/Gradle18_Shared$ gradle :Gradle18_Shared:publish --dry-run

> Configure project :Gradle2_taskWithoutAction
welcome to gradle:Gradle18_Shared:generatePomFileForFirstApiPublication SKIPPED
:compileJava SKIPPED
:processResources SKIPPED
:classes SKIPPED
:jar SKIPPED
:Gradle18_Shared:compileJava SKIPPED
:Gradle18_Shared:processResources SKIPPED
:Gradle18_Shared:classes SKIPPED
:Gradle18_Shared:myjar1 SKIPPED
:Gradle18_Shared:publishFirstApiPublicationToAu.release.repoRepository SKIPPED
:Gradle18_Shared:generatePomFileForSecondApiPublication SKIPPED
:Gradle18_Shared:myjar2 SKIPPED
:Gradle18_Shared:publishSecondApiPublicationToAu.release.repoRepository SKIPPED
:Gradle18_Shared:publish SKIPPED


custome jar:


task myjar1(type: Jar){

    baseName='myjar1api'

    from sourceSets.main.output

    include 'com/MYException1.class'
    include 'com/MYException2.class'
    include 'com/shared/Client.class'


    manifest{
        attributes(
                'SVN-Revision': 'Dummy',
                'Jenkins-Job-name':jenkinsJobName,
                'Jenkins-Build-Number':jenkinsBuildNumber,
                'Date':new Date().format('MM/dd/yyyy HH:mm:ss')
        )
    }
}


custom Zip:
task myjar2packazeZip(type:Zip){


    doFirst {
        file("$projectDir/build/BUILD").text=jenkinsBuildNumber
    }

    from ('build/libs'){
        include 'myjar2api*.jar'
    }
    from ('build'){
        include 'BUILD'
    }
    into 'my-jar2-api'
    archiveName ='my-jar2-api-'+version+'_'+jenkinsBuildNumber+'.zip'

}