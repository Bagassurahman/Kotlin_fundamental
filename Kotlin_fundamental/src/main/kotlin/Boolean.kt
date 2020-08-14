import java.util.*

fun main() {
    print("Masukkan Nilai Anda = ")
    val point = Scanner(System.`in`)
    val nilai:Int = point.nextInt()
    val result = if(nilai >= 90 && nilai <= 100) {
        "A"
    }
    else if(nilai >= 80 && nilai < 90){
        "B"
    }
    else if(nilai >= 70 && nilai < 80){
        "C"
    }
    else if(nilai >= 60 && nilai < 70){
        "D"
    }
    else if(nilai <= 50){
        "E"
    }
    else{
        "Masukkan Nilai Yang Benar"
    }
    print("Nilai anda $nilai = $result ")
}


