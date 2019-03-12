package uk.co.logiccache

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

internal class KataTest : StringSpec({

    "nothing to sum" {
        sumOfPositives(listOf()) shouldBe 0
    }

    "single 1" {
        sumOfPositives(listOf(1)) shouldBe 1
    }

    "single -1" {
        sumOfPositives(listOf(-1)) shouldBe 0
    }

    "[1,-4,7,12] => 1 + 7 + 12 = 20" {
        sumOfPositives(listOf(1, -4, 7, 12)) shouldBe 20
    }

})