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
                stage('Branch A') {
                    steps {
                        echo "On Branch A"
                        sh 'java /home/aselsan/Desktop/java1.java'
                    }
                }
                stage('Branch B') {
                    steps {
                        echo "On Branch B"
                        sh 'python3 /home/aselsan/Desktop/python1.py'
                    }
                }
            }
    }
  }
}
