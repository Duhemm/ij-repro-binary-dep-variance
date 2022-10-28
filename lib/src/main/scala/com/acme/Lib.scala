package com.acme

trait PQ
trait II[-Q <: PQ]
object AI extends II[PQ]
trait UIB[-Q <: PQ, +I <: TI] {
  def ii: II[Q] = AI
}
sealed trait TI
case class CCTI() extends TI
object IOFP extends II[PQ with HPC[_]]
trait HPC[+Cursor <: PC]
trait PC



case class AEIB[Q <: PQ](
  override val ii: II[Q] = AI)
    extends UIB[Q, AETI]


case class CCIB[Q <: PQ](
  override val ii: II[Q] = AI)
    extends UIB[Q, CCTI]

case class AETI() extends TI

trait HM
trait UB[-Q <: PQ, +I <: TI]
trait DM[-Q <: PQ, DRT]
case class T(
  i: Seq[TI])
    extends HM


case class UDM[-Q <: PQ](
  val ib: Seq[UIB[Q, TI]] =
    Seq(AEIB()))
    extends DM[Q, T]
    with UB[Q, TI]

