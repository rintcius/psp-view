package psp
package common

import scala.{ collection => sc }
import sc.{ mutable => scm, generic => scg }

trait ScalaTypes {
  type tailrec      = scala.annotation.tailrec
  type uV           = scala.annotation.unchecked.uncheckedVariance
  type IdFun[A]     = A => A
  type =?> [-A, +B] = PartialFunction[A, B]

  type Traversable[+A]                                             = sc.Traversable[A]
  type GenTraversableOnce[+A]                                      = sc.GenTraversableOnce[A]
  type GenTraversable[+A]                                          = sc.GenTraversable[A]
  type GenIterable[+A]                                             = sc.GenIterable[A]
  type GenTraversableLike[+A, +Repr]                               = sc.GenTraversableLike[A, Repr]
  type TraversableLike[+A, +Repr]                                  = sc.TraversableLike[A, Repr]
  type IterableLike[+A, +Repr]                                     = sc.IterableLike[A, Repr]
  type SeqLike[+A, +Repr]                                          = sc.SeqLike[A, Repr]
  type Builder[-Elem, +To]                                         = scm.Builder[Elem, To]
  type ArrayBuilder[T]                                             = scm.ArrayBuilder[T]
  type WrappedArray[A]                                             = scm.WrappedArray[A]
  type ArrayBuffer[A]                                              = scm.ArrayBuffer[A]
  type IsSeqLike[Repr]                                             = scg.IsSeqLike[Repr]
  type IsTraversableLike[Repr]                                     = scg.IsTraversableLike[Repr]
  type GenericCompanion[+CC[X] <: GenTraversable[X]]               = scg.GenericCompanion[CC]
  type GenericTraversableTemplate[+A, +CC[X] <: GenTraversable[X]] = scg.GenericTraversableTemplate[A, CC]
  type FilterMonadic[+A, +Repr]                                    = scg.FilterMonadic[A, Repr]
  type CanBuildFrom[-From, -Elem, +To]                             = scg.CanBuildFrom[From, Elem, To]
  type CBF[-From, -Elem, +To]                                      = scg.CanBuildFrom[From, Elem, To]

  type LinkedBlockingQueue[A] = java.util.concurrent.LinkedBlockingQueue[A]
}
