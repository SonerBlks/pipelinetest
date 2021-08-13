node{
  stages{
    stage('ONE'){
      steps{
        echo'Stage one is started'
      }
    }
    stage('TWO'){
      steps{
        echo'Stage two: Trying to open the file'
        sh 'java /home/aselsan/Desktop/java1.java'
      }
    }
  }
}
