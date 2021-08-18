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
      }
    }
    stage('Parallel Stage') {
            parallel {
                stage('Stage A') {
                    steps {
                        echo "On Stage A"
                        sh 'java /home/aselsan/Desktop/java1.java'
                    }
                }
                stage('Stage B') {
                    steps {
                        echo "On Stage B"
                        sh 'python3 /home/aselsan/Desktop/python1.py'
                    }
                }
            }
    }
  }
}
