pipeline{
  agent any
  stages{
    stage('ONE'){
      steps{
        echo'Stage one is started'
      }
    }
    stage('TWO'){
      steps{
        echo'Stage two: Trying to open the file'
        java helloworld.java
      }
    }
  }
}
