import tweepy

def get_api(cfg):
  auth = tweepy.OAuthHandler(cfg['consumer_key'], cfg['consumer_secret'])
  auth.set_access_token(cfg['access_token'], cfg['access_token_secret'])
  return tweepy.API(auth)

def main():
  # Fill in the values noted in previous step here
  cfg = { 
    "consumer_key"        : "PTcEK3vGgVtSVtPlhg7FzSVlu",
    "consumer_secret"     : "2wal7GyqiJgWWKoBS3yQ792G3GWMmn7pBzXPyrimZh1miVOcQp",
    "access_token"        : "724538594640191488-PQkgyTZgfq17IvoQFVYSOJ5JKEVVtb5",
    "access_token_secret" : "gBZ6YaF6oOAroudcMIwkB0cpSh8FjNxa1At7kya5iafpp" 
    }

  api = get_api(cfg)
  tweet = "Hello, world!"
  status = api.update_status(status=tweet) 
  # Yes, tweet is called 'status' rather confusing

if __name__ == "__main__":
  main()

