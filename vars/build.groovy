def class ()
{
  echo 'build code started..'
  docker build -t my-notes-app:latest .
  echo 'build code finished..'
}
