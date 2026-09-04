def call ()
{
  echo 'build code started..'
  sh 'docker build -t my-notes-app:latest .'
  echo 'build code finished..'..'
}
