fun main() {
    val name = "Kotlin"
    val age : Int = 4
    val version = "1.3.70"

    val hello ="""
        Nama saya $name
        Saya berusia $age tahun
        Saat ini saya sudah mencapai versi $version
    """.trimIndent()
    print(hello)
}