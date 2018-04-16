package demitasse

class BootStrap {

    def init = { servletContext ->
        new demitasse.Product(name: "Morning Blend", sku:"MB01",price: 14.95).save()
        new demitasse.Product(name: "Dark Roast", sku:"DK01",price: 12.95).save()
    }
    def destroy = {
    }
}
