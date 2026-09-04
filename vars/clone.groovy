def call (String url , String branch)
{
  echo 'code clone started..'
  git ( url: url , branch: branch ) 
  echo 'code clone end..'
}
