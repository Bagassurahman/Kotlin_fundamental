fun main() {
    val panjang = "20"
    val lebar = 12.6
    val tinggi = 10
    val volume : Double

    val v = hitungVolume(panjang.toDouble() + 2,lebar,tinggi.toDouble() + 1)
    val p = panjang
    val l = lebar
    val t = tinggi
    volume = v.toDouble()

}
fun hitungVolume(p : Double, l : Double, t : Double) : Float {
    val v = p * l * t
    print("Volume dari balok yang mempunyai panjang $p, lebar $l, dan tinggi $t ini adalah $v")
    return v.toFloat()
}