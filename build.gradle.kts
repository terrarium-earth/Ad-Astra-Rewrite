plugins {
  kotlin("jvm") version "2.1.21"
  id("com.google.devtools.ksp") version "2.1.21-2.0.1"
  id("earth.terrarium.cloche") version "0.9.17"
}

repositories {
  cloche {
    librariesMinecraft()
    mavenNeoforgedMeta()
    mavenNeoforged()
  }
}

cloche {
  metadata {
    modId = "adastra"
    name = "Ad Astra"
    description = "Cool space mod"
    license = "MIT"
    author("Alex Nijjar")
  }

  minecraftVersion = "1.21.5"

  singleTarget {
    neoforge {
      loaderVersion = "21.5.67-beta"
      mixins.from("adastra.mixins.json")

      data()
      test()

      runs {
        server()
        client()
        clientData()
        test()
      }
    }
  }

  mappings {
    official()
    parchment("2025.04.19")
  }
}
