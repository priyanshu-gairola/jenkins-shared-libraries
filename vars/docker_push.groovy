def call(String project , String tag , String dockerhubUser)
{
echo 'started image pushing to docker hub'

withCredentials([
                usernamePassword(
                    credentialsId: 'dockerhub-cred',
                    usernameVariable: 'dockerhubUser',
                    passwordVariable: 'dockerhubpass'
                )
      ]) 
                sh 'docker login -u "$dockerhubUser" -p "$dockerhubpass" '
                sh 'docker image tag my-notes-app:latest priyanshugairola/my-notes-app:latest'
                sh 'docker push priyanshugairola/my-notes-app:latest'
}
