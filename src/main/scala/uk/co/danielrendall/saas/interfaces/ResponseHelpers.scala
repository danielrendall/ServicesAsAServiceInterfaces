package uk.co.danielrendall.saas.interfaces

import fi.iki.elonen.NanoHTTPD.Response.Status
import fi.iki.elonen.NanoHTTPD.{MIME_PLAINTEXT, Response}

trait ResponseHelpers:

  def ok(msg: String)
        (implicit responseFactory: ResponseFactory): Response =
    responseFactory.newFixedLengthResponse(Status.OK, MIME_PLAINTEXT, msg)

  def notFound(msg: String)
              (implicit responseFactory: ResponseFactory): Response =
    responseFactory.newFixedLengthResponse(Status.NOT_FOUND, MIME_PLAINTEXT, msg)

  def badRequest(msg: String)
                (implicit responseFactory: ResponseFactory): Response =
    responseFactory.newFixedLengthResponse(Status.BAD_REQUEST, MIME_PLAINTEXT, msg)

  def notImplemented(msg: String)
                    (implicit responseFactory: ResponseFactory): Response =
    responseFactory.newFixedLengthResponse(Status.NOT_IMPLEMENTED, MIME_PLAINTEXT, msg)

