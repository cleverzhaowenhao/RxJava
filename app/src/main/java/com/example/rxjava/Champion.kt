package com.example.rxjava

import java.util.*

class Champion() {
    var damage =60  //攻击力
    var magic = 0  //法强
    var attackRate = 0.67  //攻速
    var lifeVolume = 600  //生命值
    var blueVolume = 800  //蓝量
    var physicalResist = 30 //护甲
    var magicResist = 15 //魔抗
    var movingSpeed = 325 //移动速度
    var money = 450  //拥有金币
    var attackDistance = 450

    fun PhysicalDamagePerMinute(): Double {
        return damage * attackRate * 60
    }

    fun MagicDamagePerTime(rate: Double): Double {
        return magic*rate
    }

    fun startPlay() {
    }

    fun lockOnTarget() {
        println("touch the attack button, keep touching and moving your finger, select a target through the end spot of the indicator")
    }

    fun cancelLockOnTarget() {

    }

    companion object {
        val skill1 = Skill() //一技能
        val skill2 = Skill() //二技能
        val skill3 = Skill() //三技能
        val skill4 = Skill() //大招

        fun createHero(): Champion {
            return Champion()
        }
    }
}

fun main() {
    println(null == "1")
    println(3000*9+2500*14+2500+2300+3500*12)
    println(15000*6)
    println(2.5*24*12)
    println(16.2*30)
val hero = Champion()
    println(hero.damage)
    println(Date())
    println(hero.toString())
}

enum class Color {
}