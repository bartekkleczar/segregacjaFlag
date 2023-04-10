fun poKolorach(kolory: Int, lista: MutableList<Panstwo>){
    for(i in lista){
        if(i.kolory == kolory){
            println(i.nazwa)
        }
    }
}

fun filter(kolory: Int, lista: MutableList<Panstwo>){
    for(i in lista){
        if(i.kolory == kolory){
            println(i.nazwa)
        }
    }
}