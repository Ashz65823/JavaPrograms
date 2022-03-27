JWT
Json web token

-Expiration time

	header.payload.signature
	header -	Algorithm used for token generation
	payload- additional information while generating the token(username ,roles)
	signature- private sensitive String value which validate the token
			(This String Stores only on Server not shared with client)
			(This String Should be very complex so that it can't be guessed)
			
			
eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.(header)
eyIiOiJ6ZW5zYXIiLCJleHAiOjE2NDc5MjY2MTd9.(payload)
lyqjWi_N_VFPmW90JoAFLOJA5NDLSo1kvXN-ybmFX2Cz6Ey2j7BH8wKSTYQtuu4WkeXuZ8ITw2ajSggStQHrBg(signature)

eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyIiOiJ6ZW5zYXIiLCJleHAiOjE2NDc5MjY2MTd9.lyqjWi_N_VFPmW90JoAFLOJA5NDLSo1kvXN-ybmFX2Cz6Ey2j7BH8wKSTYQtuu4WkeXuZ8ITw2ajSggStQHrBg