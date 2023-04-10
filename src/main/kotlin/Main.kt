fun main() {
    var Niemcy = Panstwo("Niemcy", u = "poziome", z = false, cze = true, bi = false, ni = false, cza = true)
    var Polska = Panstwo("Polska", u = "poziome", z = false, cze = true, bi = true, ni = false, cza = false)
    var Anglia = Panstwo("Anglia", u = "krzyz", z = false, cze = true, bi = true, ni = false, cza = false)
    var a = mutableListOf<Panstwo>(Anglia, Polska, Niemcy)
    var b = mutableListOf<Panstwo>()
    filterKolory(a, b, cze = true, bi = false, ni = false, cza = true)

    results(b)
}