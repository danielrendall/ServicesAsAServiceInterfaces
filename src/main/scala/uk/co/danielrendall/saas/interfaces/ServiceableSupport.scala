package uk.co.danielrendall.saas.interfaces
import fi.iki.elonen.NanoHTTPD
import fi.iki.elonen.NanoHTTPD.Response.Status

abstract class ServiceableSupport extends Serviceable:

  override def get(session: ServiceSession, first: String, rest: List[String])
                  (implicit responseFactory: ResponseFactory): NanoHTTPD.Response = reject

  override def post(session: ServiceSession, first: String, rest: List[String])
                   (implicit responseFactory: ResponseFactory): NanoHTTPD.Response = reject

  override def put(session: ServiceSession, first: String, rest: List[String])
                  (implicit responseFactory: ResponseFactory): NanoHTTPD.Response = reject

  override def delete(session: ServiceSession, first: String, rest: List[String])
                     (implicit responseFactory: ResponseFactory): NanoHTTPD.Response = reject

  protected def reject(implicit responseFactory: ResponseFactory): NanoHTTPD.Response =
    responseFactory.newFixedLengthResponse(Status.NOT_IMPLEMENTED, "text/plain", "")
