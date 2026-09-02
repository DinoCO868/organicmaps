package app.organicmaps;

/**
 * AeroGuard-specific product policy.
 *
 * Public OpenStreetMap editing is disabled. Operational company data is kept in
 * private AeroGuard layers and will be synchronized only with AeroGuard services.
 */
public final class AeroGuardPolicy
{
  public static final boolean OSM_EDITING_ENABLED = false;

  private AeroGuardPolicy() {}
}
