fun main(args: Array<String>){

    //Char ile string ifadenin disiziyle elemanlara eriş
val mrb="ahmet -| me |hmet"
    var item:Char
    item=mrb[0]
    print(item)
    // """ dsdsd  """   olduğu gibi basttırır
    val rowsText="""
        *
    *      *
  *          *
 * * * * * * *
 *   MR      *
 *      TS   *
 * * * * * * *
    *****
    """
    print(rowsText)
    // METNİ BİR YERİNİ KESMEK İÇİN TRIMMARGIN:
    print(mrb.trimMargin("ahmet"))

    //Compare to --->metin eşleştirme için kullanılır
    //sunsequence --> baş ve bitiş index verilir-siler
    // .? kullanmak yerine  !! kullan

}