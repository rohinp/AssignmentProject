#!groovy

stage 'setJava'
node {

    // env.JAVA_HOME = "C:\\Program Files\\Java\\jdk1.8.0_66"
     env.JAVA_HOME = "C:\\Program Files (x86)\\Java\\jdk1.8.0_11"
     echo env.JAVA_HOME

}
stage 'Checkout'
node {
git 'https://github.com/vaiju12p/AssignmentProject.git'
stage 'clean'
sh 'gradle eclipse --info'
stage 'build'
sh 'gradle artifactoryPublish --info'
//stage 'jar'
//bat 'gradle jar --info'
}
stage 'Checkout'
node {
git 'https://github.com/vaiju12p/ModeratorTemplate1.1-1.git'
stage 'clean'
sh 'gradle clean --info'
stage 'build'
sh 'gradle build --info'
//stage 'jar'
//bat 'gradle jar --info'
}

stage name: 'Production', concurrency: 1
node {
 echo 'Production server looks to be alive'
 echo "Deployed to production"
}
