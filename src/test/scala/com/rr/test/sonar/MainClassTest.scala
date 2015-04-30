package com.rr.test.sonar

import org.junit.runner.RunWith
import org.specs2.Specification
import org.specs2.runner.JUnitRunner

/**
 *
 *
 * Created 4/30/15
 *
 * @author dsobral
 */
@RunWith(classOf[JUnitRunner])
class MainClassTest extends Specification {

  def is =
    s2"""
       Sonar Test
         Adds stuff $testAdd
     """

  val two = new MainClass(2)

  def testAdd = {
    two.plus(3) must beEqualTo(5)
  }

}
