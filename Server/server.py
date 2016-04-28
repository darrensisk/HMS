
import time
from twython import Twython


# defining twitter keys & tokens
APP_KEY = 'PTcEK3vGgVtSVtPlhg7FzSVlu'
APP_SECRET = '2wal7GyqiJgWWKoBS3yQ792G3GWMmn7pBzXPyrimZh1miVOcQp'
OAUTH_TOKEN = '724538594640191488-PQkgyTZgfq17IvoQFVYSOJ5JKEVVtb5'
OAUTH_SECRET = 'gBZ6YaF6oOAroudcMIwkB0cpSh8FjNxa1At7kya5iafpp'
TWITTER_DATA_FILE = 'twitter.txt'

twitter = Twython(APP_KEY, APP_SECRET, OAUTH_TOKEN, OAUTH_SECRET)

twitter_handle = None


# defining urls handled by the server
urls = (
    '/Home',                    'HomeHandler',                 # general server status
    '/Temperature',             'TemperatureHandler',           # temperature & heating
    '/Alarm',                   'AlarmHandler',                 # alarm & break-in status
    '/Camera',                  'CameraHandler',                # activates the camera
    '/BreakIn',                 'BreakInHandler'                # simulates a break-in

)
alarm = False
heating = False
lights = False

app = web.application(urls, globals())

class HomeHandler:

	def __init__(self)
		 print '[INFO]: Initializing TemperatureHandler...'
		
class TemperatureHandler:

    def __init__(self):
        print 'Temperature'

    # GET /Temperature

    # POST /Temperature
    def POST(self):
		if heating = False
			execfile(heating-on.py)
        else if
			heating = True
			execfile(heating-off.py)
			
class LightsHandler:

    def __init__(self):
        print 'Temperature'

    # GET /Temperature

    # POST /Temperature
    def POST(self):
		if lights = False
			execfile(lights-on.py)
        else if
			heating = True
			execfile(lights-off.py)
			
class AlarmHandler:

	def __init__(self)
		print "Alarm"
		
	def POST(self)
		if alarm = False
			execfile(twitter.py)
			execfile(camera.py)
		else
			print 'All is good'