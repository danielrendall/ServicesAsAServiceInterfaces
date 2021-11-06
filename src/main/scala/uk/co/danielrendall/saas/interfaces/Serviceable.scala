package uk.co.danielrendall.saas.interfaces

import fi.iki.elonen.NanoHTTPD.{IHTTPSession, Response}

trait Serviceable:

  def getMetadata: ServiceMetadata

  def get(session: ServiceSession, first: String, rest: List[String])
         (implicit responseFactory: ResponseFactory): Response

  def post(session: ServiceSession, first: String, rest: List[String])
          (implicit responseFactory: ResponseFactory): Response

  def put(session: ServiceSession, first: String, rest: List[String])
         (implicit responseFactory: ResponseFactory): Response

  def delete(session: ServiceSession, first: String, rest: List[String])
            (implicit responseFactory: ResponseFactory): Response
