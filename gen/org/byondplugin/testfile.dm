mob
    var
        age
        name

    Login()
        ..()
        src.age = 25
        src.name = "Johny Bravo" // super cool name
        world << "Hello [src.name]"

    Logout()
        ..()
        del(M)

    proc
        GetName()
            return src.name

proc
	dupa()
		world << "Hello"
		return list(1, 2, "3")
	kupa()
		world << "Hai"
		return 5

/*

mob/Login()
	var/mob
		M = new /mob()
		K = new /mob()
	for(var/mob/M as anything in dupa())
		world << M
		del(M)

*/