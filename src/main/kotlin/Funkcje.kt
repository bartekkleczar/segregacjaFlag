fun filterKolory(listaInput: MutableList<Panstwo>, listaOutput: MutableList<Panstwo>, cze : Boolean = false, bi : Boolean = false, ni : Boolean = false, cza : Boolean = false ){
    for(i in listaInput){
        if(cze == i.czerwony && bi == i.bialy && ni == i.niebieski && cza == i.czarny){
            listaOutput.add(i)
        }
    }
}

fun fiterUlozenie(listaInput: MutableList<Panstwo>, listaOutput: MutableList<Panstwo>, u: String = "poziome"){
    for(i in listaInput){
        if(u == i.ulozenie){
            listaOutput.add(i)
        }
    }
}

fun results(listaOutput: MutableList<Panstwo>){
    for(i in listaOutput) {
        println(i.nazwa) }
}