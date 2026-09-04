def call (string url , string branch)
{
  echo 'code clone started..'
  git ( url: $url" , branch: "$branch" ) 
  echo 'code clone end..'
}
