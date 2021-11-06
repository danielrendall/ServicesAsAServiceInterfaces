package uk.co.danielrendall.saas.interfaces

import java.io.InputStream

trait ServiceSession:

  def headers: Map[String, String]

  def queryParameters: Map[String, List[String]]

  def bodyAsBytes: Array[Byte]

  def bodyAsInputStream: InputStream

  def bodyAsFiles: Map[String, String]
