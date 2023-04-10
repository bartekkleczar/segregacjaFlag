fun filterKolory(listaInput: MutableList<Panstwo>, listaOutput: MutableList<Panstwo>, cze : Boolean = true, bi : Boolean = true, ni : Boolean = true, cza : Boolean = true ){
    for(i in listaInput){
        if(cze == i.czerwony && bi == i.bialy && ni == i.niebieski && cza == i.czarny){
            listaOutput.add(i)
        }
    }
}

fun results(listaOutput: MutableList<Panstwo>){
    for(i in listaOutput) {
        println(i.nazwa) }
}