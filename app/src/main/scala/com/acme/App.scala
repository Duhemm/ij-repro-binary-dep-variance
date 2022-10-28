package com.acme

object App {
    val ib = Seq(
      CCIB(IOFP),
      AEIB()
    )

  val m = UDM(ib)
  z(m)

  def z(xx: UDM[PQ with HPC[_]]) = ()
}
