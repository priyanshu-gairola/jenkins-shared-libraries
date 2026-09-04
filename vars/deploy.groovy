def call(String project, String tag) 
{
    sh "docker rm -f ${project} || true && docker run -d --name ${project} -p 8080:8080 ${DOCKERHUB_USER}/${project}:${tag}"
}
