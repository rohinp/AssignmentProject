#!groovy

stage 'Checkout'
node {
git 'https://github.com/rohinp/AssignmentProject.git'
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
