package uk.co.danielrendall.saas.interfaces

import fi.iki.elonen.NanoHTTPD.Response

import java.io.InputStream

trait ResponseFactory:

  def newFixedLengthResponse(status: Response.IStatus, mimeType: String, data: InputStream, totalBytes: Long): Response

  def newFixedLengthResponse(status: Response.IStatus, mimeType: String, txt: String): Response
