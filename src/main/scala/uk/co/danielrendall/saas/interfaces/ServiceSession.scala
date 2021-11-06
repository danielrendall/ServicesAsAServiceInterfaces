package uk.co.danielrendall.saas.interfaces

import java.io.InputStream

trait ServiceSession:

  def headers: Map[String, String]

  def queryParameters: Map[String, List[String]]

  // Only keep the first of each parameter assuming it's non-blank
  def reducedQueryParameters: Map[String, String] =
    queryParameters.flatMap { case (key, list) => list.headOption.map(value => key -> value) }.toMap

  def bodyAsBytes: Array[Byte]

  def bodyAsInputStream: InputStream

  def bodyAsFiles: Map[String, String]
