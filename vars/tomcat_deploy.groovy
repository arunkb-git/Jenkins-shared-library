def call(servername,artifact_name){
 sshPublisher(publishers: [sshPublisherDesc(configName: ${servername}, transfers: [sshTransfer(cleanRemote: false, excludes: '', execCommand: '''/opt/tomcat11/bin/shutdown.sh
/opt/tomcat11/bin/startup.sh''', execTimeout: 120000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: '', remoteDirectorySDF: false, removePrefix: 'target', sourceFiles: 'target/${artifact_name}.war')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)]) 
}
