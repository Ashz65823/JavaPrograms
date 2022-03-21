JWT
Json web token

-Expiration time

	header.payload.signature
	header -	Algorithm used for token generation
	payload- additional infromation while generating the token(username ,roles)
	signature- private sensitive String value which validate the token
			(This String Stores only on Server not shared with client)
			(This String Should be very complex so that it can't be guessed)