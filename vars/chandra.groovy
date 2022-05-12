def call(tomcatIp,warName,credId){
  sshagent([$"{cerdId}"]) {
    sh "scp -o StrictHostKeyChecking=no target/webby.war ec2-user@${tomcatIp}:/opt/tomcat8/webapps/${warName}.war"
            sh  "ssh ec2-user@${tomcatIp} /opt/tomcat8/bin/startup.sh"
            sh  "ssh ec2-user@${tomcatIp} /opt/tomcat8/bin/shutdown.sh"
}
}
