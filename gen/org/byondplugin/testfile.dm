proc/dupa()
	world << "Hello"
	return list(1, 2, "3")


mob/Login()
	var/mob
		M = new /mob()
		K = new /mob()
	for(var/mob/M as anything in dupa())
		world << M
		del(M)