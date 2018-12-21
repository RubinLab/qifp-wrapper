/*******************************************************************************
 * Copyright (c) 2015 The Board of Trustees of the Leland Stanford Junior University
 * BY CLICKING ON "ACCEPT," DOWNLOADING, OR OTHERWISE USING EPAD, YOU AGREE TO THE FOLLOWING TERMS AND CONDITIONS:
 * STANFORD ACADEMIC SOFTWARE SOURCE CODE LICENSE FOR
 * "ePAD Annotation Platform for Radiology Images"
 *
 * This Agreement covers contributions to and downloads from the ePAD project ("ePAD") maintained by The Board of Trustees 
 * of the Leland Stanford Junior University ("Stanford"). 
 *
 * *	Part A applies to downloads of ePAD source code and/or data from ePAD. 
 *
 * *	Part B applies to contributions of software and/or data to ePAD (including making revisions of or additions to code 
 * and/or data already in ePAD), which may include source or object code. 
 *
 * Your download, copying, modifying, displaying, distributing or use of any ePAD software and/or data from ePAD 
 * (collectively, the "Software") is subject to Part A. Your contribution of software and/or data to ePAD (including any 
 * that occurred prior to the first publication of this Agreement) is a "Contribution" subject to Part B. Both Parts A and 
 * B shall be governed by and construed in accordance with the laws of the State of California without regard to principles 
 * of conflicts of law. Any legal action involving this Agreement or the Research Program will be adjudicated in the State 
 * of California. This Agreement shall supersede and replace any license terms that you may have agreed to previously with 
 * respect to ePAD.
 *
 * PART A. DOWNLOADING AGREEMENT - LICENSE FROM STANFORD WITH RIGHT TO SUBLICENSE ("SOFTWARE LICENSE").
 * 1. As used in this Software License, "you" means the individual downloading and/or using, reproducing, modifying, 
 * displaying and/or distributing Software and the institution or entity which employs or is otherwise affiliated with you. 
 * Stanford  hereby grants you, with right to sublicense, with respect to Stanford's rights in the Software, a 
 * royalty-free, non-exclusive license to use, reproduce, make derivative works of, display and distribute the Software, 
 * provided that: (a) you adhere to all of the terms and conditions of this Software License; (b) in connection with any 
 * copy, distribution of, or sublicense of all or any portion of the Software, the terms and conditions in this Software 
 * License shall appear in and shall apply to such copy and such sublicense, including without limitation all source and 
 * executable forms and on any user documentation, prefaced with the following words: "All or portions of this licensed 
 * product  have been obtained under license from The Board of Trustees of the Leland Stanford Junior University. and are 
 * subject to the following terms and conditions" AND any user interface to the Software or the "About" information display 
 * in the Software will display the following: "Powered by ePAD http://epad.stanford.edu;" (c) you preserve and maintain 
 * all applicable attributions, copyright notices and licenses included in or applicable to the Software; (d) modified 
 * versions of the Software must be clearly identified and marked as such, and must not be misrepresented as being the 
 * original Software; and (e) you consider making, but are under no obligation to make, the source code of any of your 
 * modifications to the Software freely available to others on an open source basis.
 *
 * 2. The license granted in this Software License includes without limitation the right to (i) incorporate the Software 
 * into your proprietary programs (subject to any restrictions applicable to such programs), (ii) add your own copyright 
 * statement to your modifications of the Software, and (iii) provide additional or different license terms and conditions 
 * in your sublicenses of modifications of the Software; provided that in each case your use, reproduction or distribution 
 * of such modifications otherwise complies with the conditions stated in this Software License.
 * 3. This Software License does not grant any rights with respect to third party software, except those rights that 
 * Stanford has been authorized by a third party to grant to you, and accordingly you are solely responsible for (i) 
 * obtaining any permissions from third parties that you need to use, reproduce, make derivative works of, display and 
 * distribute the Software, and (ii) informing your sublicensees, including without limitation your end-users, of their 
 * obligations to secure any such required permissions.
 * 4. You agree that you will use the Software in compliance with all applicable laws, policies and regulations including, 
 * but not limited to, those applicable to Personal Health Information ("PHI") and subject to the Institutional Review 
 * Board requirements of the your institution, if applicable. Licensee acknowledges and agrees that the Software is not 
 * FDA-approved, is intended only for research, and may not be used for clinical treatment purposes. Any commercialization 
 * of the Software is at the sole risk of you and the party or parties engaged in such commercialization. You further agree 
 * to use, reproduce, make derivative works of, display and distribute the Software in compliance with all applicable 
 * governmental laws, regulations and orders, including without limitation those relating to export and import control.
 * 5. You or your institution, as applicable, will indemnify, hold harmless, and defend Stanford against any third party 
 * claim of any kind made against Stanford arising out of or related to the exercise of any rights granted under this 
 * Agreement, the provision of Software, or the breach of this Agreement. Stanford provides the Software AS IS and WITH ALL 
 * FAULTS.  Stanford makes no representations and extends no warranties of any kind, either express or implied.  Among 
 * other things, Stanford disclaims any express or implied warranty in the Software:
 * (a)  of merchantability, of fitness for a particular purpose,
 * (b)  of non-infringement or 
 * (c)  arising out of any course of dealing.
 *
 * Title and copyright to the Program and any associated documentation shall at all times remain with Stanford, and 
 * Licensee agrees to preserve same. Stanford reserves the right to license the Program at any time for a fee.
 * 6. None of the names, logos or trademarks of Stanford or any of Stanford's affiliates or any of the Contributors, or any 
 * funding agency, may be used to endorse or promote products produced in whole or in part by operation of the Software or 
 * derived from or based on the Software without specific prior written permission from the applicable party.
 * 7. Any use, reproduction or distribution of the Software which is not in accordance with this Software License shall 
 * automatically revoke all rights granted to you under this Software License and render Paragraphs 1 and 2 of this 
 * Software License null and void.
 * 8. This Software License does not grant any rights in or to any intellectual property owned by Stanford or any 
 * Contributor except those rights expressly granted hereunder.
 *
 * PART B. CONTRIBUTION AGREEMENT - LICENSE TO STANFORD WITH RIGHT TO SUBLICENSE ("CONTRIBUTION AGREEMENT").
 * 1. As used in this Contribution Agreement, "you" means an individual providing a Contribution to ePAD and the 
 * institution or entity which employs or is otherwise affiliated with you.
 * 2. This Contribution Agreement applies to all Contributions made to ePAD at any time. By making a Contribution you 
 * represent that: (i) you are legally authorized and entitled by ownership or license to make such Contribution and to 
 * grant all licenses granted in this Contribution Agreement with respect to such Contribution; (ii) if your Contribution 
 * includes any patient data, all such data is de-identified in accordance with U.S. confidentiality and security laws and 
 * requirements, including but not limited to the Health Insurance Portability and Accountability Act (HIPAA) and its 
 * regulations, and your disclosure of such data for the purposes contemplated by this Agreement is properly authorized and 
 * in compliance with all applicable laws and regulations; and (iii) you have preserved in the Contribution all applicable 
 * attributions, copyright notices and licenses for any third party software or data included in the Contribution.
 * 3. Except for the licenses you grant in this Agreement, you reserve all right, title and interest in your Contribution.
 * 4. You hereby grant to Stanford, with the right to sublicense, a perpetual, worldwide, non-exclusive, no charge, 
 * royalty-free, irrevocable license to use, reproduce, make derivative works of, display and distribute the Contribution. 
 * If your Contribution is protected by patent, you hereby grant to Stanford, with the right to sublicense, a perpetual, 
 * worldwide, non-exclusive, no-charge, royalty-free, irrevocable license under your interest in patent rights embodied in 
 * the Contribution, to make, have made, use, sell and otherwise transfer your Contribution, alone or in combination with 
 * ePAD or otherwise.
 * 5. You acknowledge and agree that Stanford ham may incorporate your Contribution into ePAD and may make your 
 * Contribution as incorporated available to members of the public on an open source basis under terms substantially in 
 * accordance with the Software License set forth in Part A of this Agreement. You further acknowledge and agree that 
 * Stanford shall have no liability arising in connection with claims resulting from your breach of any of the terms of 
 * this Agreement.
 * 6. YOU WARRANT THAT TO THE BEST OF YOUR KNOWLEDGE YOUR CONTRIBUTION DOES NOT CONTAIN ANY CODE OBTAINED BY YOU UNDER AN 
 * OPEN SOURCE LICENSE THAT REQUIRES OR PRESCRIBES DISTRBUTION OF DERIVATIVE WORKS UNDER SUCH OPEN SOURCE LICENSE. (By way 
 * of non-limiting example, you will not contribute any code obtained by you under the GNU General Public License or other 
 * so-called "reciprocal" license.)
 *******************************************************************************/
package edu.stanford.epad.plugins.qifpwrapper;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.DeleteMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.methods.multipart.StringPart;
import org.apache.commons.io.IOUtils;


import org.json.JSONObject;

import edu.stanford.epad.common.dicom.DCM4CHEEUtil;
import edu.stanford.epad.common.plugins.AbstractPluginServletHandler;
import edu.stanford.epad.common.plugins.PluginAIMUtil;
import edu.stanford.epad.common.plugins.PluginDicomUtil;
import edu.stanford.epad.common.plugins.PluginEventPoster;
import edu.stanford.epad.common.plugins.PluginHandler;
import edu.stanford.epad.common.plugins.PluginXNATUtil;
import edu.stanford.epad.common.plugins.impl.PluginAIMOptions;
import edu.stanford.epad.common.util.EPADConfig;
import edu.stanford.epad.common.util.EPADFileUtils;
import edu.stanford.epad.common.util.EPADLogger;
import edu.stanford.epad.common.util.Lexicon;
import edu.stanford.hakan.aim4api.base.AimException;
import edu.stanford.hakan.aim4api.base.CD;
import edu.stanford.hakan.aim4api.base.DicomImageReferenceEntity;
import edu.stanford.hakan.aim4api.base.DicomSegmentationEntity;
import edu.stanford.hakan.aim4api.base.Image;
import edu.stanford.hakan.aim4api.base.ImageAnnotationCollection;
import edu.stanford.hakan.aim4api.base.ImageCollection;
import edu.stanford.hakan.aim4api.base.ImageSeries;
import edu.stanford.hakan.aim4api.base.ImageStudy;




@PluginHandler
public class QIFPHandler extends AbstractPluginServletHandler
{
	public static class EPADSessionResponse
	{
		public final int statusCode;
		public final String response;
		public final String message;

		public EPADSessionResponse(int responseCode, String response, String message)
		{
			this.statusCode = responseCode;
			this.response = response;
			this.message = message;
		}
	}
	
	
	private static final EPADLogger log = EPADLogger.getInstance();
	private static final String LOGIN_EXCEPTION_MESSAGE = "Internal login error";
	private static final String EPAD_UNAUTHORIZED_MESSAGE = "Unauthorized/login failed";
	private static final String EPAD_LOGIN_ERROR_MESSAGE = "Unexpected EPAD login response";
	private static HashMap<String,String[]> runningPlugins = null;
	//<instanceid,{aimID,projectID,workflowID}
	//runningPlugins.put(instanceId, new String[] {imageAnnotationCollection.getUniqueIdentifier().getRoot(), projectID, workflowID});

	
	@Override
	public void init() {
		log.info("qifp wrapper: init");
		runningPlugins = new HashMap<>();
		
	}
	
	
	@Override
	public void destroy()
	{
		log.info("qifp wrapper: destroy");
		runningPlugins = null;
	}

	@Override
	public int doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
	{
		//specificly for calling the plugin for recording results by StatusListenerHandler
		if (httpServletResponse==null) {
			String status = httpServletRequest.getParameter("status");
			String workFlowInstanceID = httpServletRequest.getParameter("workFlowInstanceID");
			String workFlowID = httpServletRequest.getParameter("workFlowID");
			log.info("plugin calling back Status:"+status + " WorkFlowID:"+workFlowID+ " WorkFlowInstanceID:"+workFlowInstanceID);
			if (status.equalsIgnoreCase("Completed"))
				saveTheFeatures(workFlowID, workFlowInstanceID);
			return HttpServletResponse.SC_OK;
			
		}
		//otherwise
		return doGet(httpServletRequest, httpServletResponse);
	}

	@Override
	public String getVersion()
	{
		return "1.0 - 2016-08-4";
	}

	@Override
	public String getName()
	{
		return "qifp";
	}

	@Override
	public String getAuthorsContactInfo()
	{
		return "Emel Alkim";
	}

	@Override
	public String getDescription()
	{
		return "QIFP Wrapper for triggering plugins in QIFP";
	}
	static int fileNum=1;
	//copied from download util
	public static File generateZipFile(List<File> files, String dirPath)
	{
		
		File dir_file = new File(dirPath);
		File zip_file = new File(dirPath+"/temp_"+(fileNum++)+".zip");
		int dir_l = dir_file.getAbsolutePath().length();
		
		FileOutputStream fos =null;
		try {
			fos = new FileOutputStream(zip_file);
		} catch (FileNotFoundException e1) {
			log.warning("File not found", e1);
			return null;
		}
    	
		ZipOutputStream zipout = new ZipOutputStream(fos);
		zipout.setLevel(1);
		for (int i = 0; i < files.size(); i++)
		{
			File f = (File) files.get(i);
			if (f.canRead())
			{
				log.info("Adding file: " + f.getAbsolutePath());
				try
				{
					zipout.putNextEntry(new ZipEntry(f.getAbsolutePath().substring(dir_l + 1)));
				}
				catch (Exception e)
				{
					log.warning("Error adding to zip file", e);
					return null;
				}
				BufferedInputStream fr;
				try
				{
					fr = new BufferedInputStream(new FileInputStream(f));

					byte buffer[] = new byte[0xffff];
					int b;
					while ((b = fr.read(buffer)) != -1)
						zipout.write(buffer, 0, b);

					fr.close();
					zipout.closeEntry();

				}
				catch (Exception e)
				{
					log.warning("Error closing zip file", e);
					return null;
				}
			}
		}

		try
		{
			zipout.finish();
			fos.flush();
		}
		catch (IOException e)
		{
			e.printStackTrace();
			return null;
		}
		log.info("file zipped and returning as "+ zip_file.getAbsolutePath());
		return zip_file;

	}
	
	@Override
	public int doGet(HttpServletRequest request, HttpServletResponse response)
	{
		int statusCode;

		String aimID = request.getParameter("aimFile");
		String projectID = request.getParameter("projectID");
		if (aimID == null) {
			log.warning("qifp wrapper: warning - missing aimFile parameter");
			statusCode = HttpServletResponse.SC_BAD_REQUEST;
		} else if (projectID == null) {
			log.warning("qifp wrapper: warning - missing projectID parameter");
			statusCode = HttpServletResponse.SC_BAD_REQUEST;
		} else {
			PrintWriter responseStream = null;
			log.info("qifp wrapper: AIM ID " + aimID);
			log.info("qifp wrapper: Project ID " + projectID);
			
			try {
				ImageAnnotationCollection templateImageAnnotationCollection = PluginAIMUtil.getImageAnnotationCollectionFromServer(aimID, projectID);
				responseStream = response.getWriter();

				if (templateImageAnnotationCollection != null) {
					// String username = imageAnnotation.getListUser().get(0).getLoginName();
					String event_status = "Started";
					String pluginName = getName();
					String sessionID = PluginXNATUtil.getJSessionIDFromRequest(request);
					PluginAIMOptions pluginAIMOptions = new PluginAIMOptions(pluginName, sessionID, templateImageAnnotationCollection);

					// Notification for the GUI that the plugin has started
					PluginEventPoster.postPluginEvent(event_status, pluginAIMOptions);
					
					PluginAIMUtil.saveAnnotationToAnnotationsDirectory(templateImageAnnotationCollection);
					
					/* Prepare inputs to invoke the plugin */
					
					// Get DICOM path					
					DicomImageReferenceEntity dicomImageReferenceEntity = (DicomImageReferenceEntity) templateImageAnnotationCollection
																			.getImageAnnotations().get(0).getImageReferenceEntityCollection().get(0);
					ImageStudy imageStudy = dicomImageReferenceEntity.getImageStudy();
					String studyUID = imageStudy.getInstanceUid().getRoot();
					String seriesUID = imageStudy.getImageSeries().getInstanceUid().getRoot();
//					String imageUID = imageStudy.getImageSeries().getImageCollection().get(0).getSopInstanceUid().getRoot();
					
					String username = templateImageAnnotationCollection.getUser().getLoginName().getValue();
					if (username.equalsIgnoreCase("shared"))
						username=null;
					List<File> dicomFiles = new ArrayList<>();
					List<String> imageUIDs = PluginDicomUtil.getDicomImageUIDsInSeries(studyUID, seriesUID, sessionID, username);
					for (String imageUID: imageUIDs) {
						File dicomFile = File.createTempFile(imageUID, ".dcm");
						DCM4CHEEUtil.downloadDICOMFileFromWADO(studyUID, seriesUID, imageUID, dicomFile);
						log.info("qifp wrapper: adding image "+  imageUID);
						dicomFiles.add(dicomFile);
					}
					
					log.info("qifp wrapper: zipping dicom files");
					
					File dsoFile =null;
					boolean result =false;
					// Get DSO if any					
					if (templateImageAnnotationCollection
							.getImageAnnotations().get(0).getSegmentationEntityCollection()!=null && templateImageAnnotationCollection
							.getImageAnnotations().get(0).getSegmentationEntityCollection().size()!=0) {
						DicomSegmentationEntity dicomSegmentationEntity = (DicomSegmentationEntity) templateImageAnnotationCollection
																				.getImageAnnotations().get(0).getSegmentationEntityCollection().get(0);
						String dsoImageUID = dicomSegmentationEntity.getSopInstanceUid().getRoot();
						log.info("qifp wrapper: dsoimageuid "+ dsoImageUID);
						dsoFile = File.createTempFile(dsoImageUID, ".dcm");
						DCM4CHEEUtil.downloadDICOMFileFromWADO(studyUID, "*", dsoImageUID, dsoFile);

						log.info("qifp wrapper: adding dso files to the list");
						dicomFiles.add(dsoFile);
						
						File dicomZip = generateZipFile(dicomFiles,dicomFiles.get(0).getParent());
						
						result=invokePlugin(templateImageAnnotationCollection, dicomZip, projectID);
					}
					else {
						log.warning("qifp wrapper: qifp requires dso");
					}
					 					
					if (result) {
						event_status = "complete";
						log.info("qifp wrapper: plugin execution complete");
					} else {
						event_status = "failed";
						log.warning("qifp wrapper: plugin execution failed");
					}
					
					PluginEventPoster.postPluginEvent(event_status, pluginAIMOptions);
				} else {
					responseStream.println("AIM file not found");
					log.warning("qifp wrapper: Could not find AIM file");
					statusCode = HttpServletResponse.SC_BAD_REQUEST;
				}
				statusCode = HttpServletResponse.SC_OK;
			} catch (IOException ioe) {
				printErrorPage(ioe, responseStream);
				log.warning("qifp wrapper: IO error invoking plugin", ioe);
				statusCode = HttpServletResponse.SC_INTERNAL_SERVER_ERROR;
			} catch (Exception e) {
				printErrorPage(e, responseStream);
				log.warning("qifp wrapper: Error invoking plugin", e);
				statusCode = HttpServletResponse.SC_INTERNAL_SERVER_ERROR;
			}
		}
		return statusCode;
	}
	
	private static String buildAuthorizationString(String username, String password)
	{
		String authString = username + ":" + password;
		byte[] authEncBytes = Base64.encodeBase64(authString.getBytes());
		String authStringEnc = new String(authEncBytes);

		return authStringEnc;
	}
	
	private static String buildEPADSessionURL(String epadHost, int port)
	{
		return buildEPADBaseURL(epadHost, port, "/qifp/session/");
	}
	
	private static String buildEPADBaseURL(String host, int port, String base)
	{
		return buildEPADBaseURL(host, port, base, "");
	}

	private static String buildEPADBaseURL(String host, int port, String base, String ext)
	{
		StringBuilder sb = new StringBuilder();
		if (!host.startsWith("http"))
			sb.append("http://");
		sb.append(host);
		if (port!=-1)
			sb.append(":").append(port);
		sb.append(base);
		sb.append(ext);

		return sb.toString();
	}

	private static EPADSessionResponse getEPADSessionID(String username, String password, String epadHost, int port)
	{
		String epadSessionURL = buildEPADSessionURL(epadHost, port);
		HttpClient client = new HttpClient();
		PostMethod method = new PostMethod(epadSessionURL);
		String authString = buildAuthorizationString(username, password);
		EPADSessionResponse epadSessionResponse;
		int epadStatusCode;

		try {
			log.info("Invoking EPAD session service for user " + username + " at " + epadSessionURL);
			method.setRequestHeader("Authorization", "Basic " + authString);
			epadStatusCode = client.executeMethod(method);
			log.info("Successfully invoked EPAD session service for user " + username + "; status code = " + epadStatusCode);
		} catch (IOException e) {
			log.warning("Error calling EPAD session service for user " + username, e);
			epadStatusCode = HttpServletResponse.SC_INTERNAL_SERVER_ERROR;
		}

		try {
			if (epadStatusCode == HttpServletResponse.SC_OK || epadStatusCode == HttpServletResponse.SC_FOUND) {
				try {
					StringBuilder sb = new StringBuilder();
					InputStreamReader isr = null;
					try {
						isr = new InputStreamReader(method.getResponseBodyAsStream());
						int read = 0;
						char[] chars = new char[128];
						while ((read = isr.read(chars)) > 0) {
							sb.append(chars, 0, read);
						}
					} finally {
						IOUtils.closeQuietly(isr);
					}
					String jsessionID = sb.toString();
					epadSessionResponse = new EPADSessionResponse(HttpServletResponse.SC_OK, jsessionID, "");
					log.debug("Session ID " + jsessionID + " generated for user " + username); // TODO temp
				} catch (IOException e) {
					log.warning(LOGIN_EXCEPTION_MESSAGE, e);
					epadSessionResponse = new EPADSessionResponse(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, null,
							LOGIN_EXCEPTION_MESSAGE + ": " + e.getMessage());
				}
			} else if (epadStatusCode == HttpServletResponse.SC_UNAUTHORIZED) {
				log.warning(EPAD_UNAUTHORIZED_MESSAGE);
				epadSessionResponse = new EPADSessionResponse(epadStatusCode, null, EPAD_UNAUTHORIZED_MESSAGE);
			} else {
				log.warning(EPAD_LOGIN_ERROR_MESSAGE + "; EPAD status code = " + epadStatusCode);
				epadSessionResponse = new EPADSessionResponse(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, null,
						EPAD_LOGIN_ERROR_MESSAGE + "; EPAD status code = " + epadStatusCode);
			}
		} finally {
			method.releaseConnection();
		}
		return epadSessionResponse;
	}
	
	
	public static int invalidateRemoteEPADSessionID(String epadSessionID, String epadHost, int port)
	{
		String epadSessionURL = buildEPADSessionURL(epadHost, port);
		HttpClient client = new HttpClient();
		DeleteMethod method = new DeleteMethod(epadSessionURL);
		int epadStatusCode;

		method.setRequestHeader("Cookie", "JSESSIONID=" + epadSessionID);

		try {
			epadStatusCode = client.executeMethod(method);
		} catch (IOException e) {
			log.warning("Error calling EPAD session service to invalidate session ID", e);
			epadStatusCode = HttpServletResponse.SC_INTERNAL_SERVER_ERROR;
		} finally {
			method.releaseConnection();
		}

		if (epadStatusCode != HttpServletResponse.SC_OK)
			log.warning("EPAD delete session call returned status code " + epadStatusCode);

		return epadStatusCode;
	}
	
	public static String sendRequest(String url, String epadSessionID, File dicomsZip, String statusURL) throws Exception
	{
		HttpClient client = new HttpClient();
        PostMethod postMethod = new PostMethod(url);
		if (epadSessionID != null)
			postMethod.setRequestHeader("Cookie", "JSESSIONID=" + epadSessionID);
        try
        {
	        Part[] parts = {new FilePart("dicoms", dicomsZip), new StringPart("statusUrl", statusURL)};
	         
	        postMethod.setRequestEntity(new MultipartRequestEntity(parts, postMethod.getParams()));
	
	        int response= client.executeMethod(postMethod);
	        String responseStr = postMethod.getResponseBodyAsString();
	        JSONObject responseJson = new JSONObject(responseStr);
	        
	        String instanceId=(String) responseJson.get("workflowInstanceID");
	        
	        if (response == HttpServletResponse.SC_OK);
	        return instanceId;
	        		
		} 
        catch (Exception e) 
        {
			log.warning("Exception calling ePAD", e);
			return null;
		}
		finally 
		{
	        postMethod.releaseConnection();	
		}       
		
	}
	
	private String shortenHost(String host) {
		return host.split("\\.")[0];//needs to excape character as it uses regex
	}
	
	private boolean invokePlugin (ImageAnnotationCollection imageAnnotationCollection, File dicomZip,String projectID) {
		
		
		try {
			
			String workflowID="3DFeatureExtractionOld";
//			String host="epad-prod8.stanford.edu";
//			String url="http://"+host+":8090/qifp/v2/workflows/"+ workflowID +"/run/?projectID="+"epad-dev4";
			String statusUrl=buildEPADBaseURL(EPADConfig.xnatServer, EPADConfig.epadPort, "/epad/statuslistener/");
			
			
			
			String runBase="/qifp/v2/workflows/"+ workflowID +"/run/?projectID="+shortenHost(EPADConfig.xnatServer);
			String url= buildEPADBaseURL(EPADConfig.qifpServer, EPADConfig.qifpPort, runBase);

			
			log.info("qifp wrapper: connecting qifp");
			EPADSessionResponse resp= getEPADSessionID(EPADConfig.qifpUserName, EPADConfig.qifpUserPass, EPADConfig.qifpServer, EPADConfig.qifpPort);
			String sessionID = resp.response;
			log.info("qifp wrapper: login response " +resp.response + " url "+ url);
			
			
//			log.info("qifp wrapper: check if files exist");
			
			log.info("qifp wrapper: send request");
			String instanceId=sendRequest(url, sessionID, dicomZip, statusUrl);
			if (instanceId!=null) {//plugin request sent successfully
				runningPlugins.put(instanceId, new String[] {imageAnnotationCollection.getUniqueIdentifier().getRoot(), projectID, workflowID});
			}
			log.info("qifp wrapper: disconnect");
			
			invalidateRemoteEPADSessionID(sessionID, EPADConfig.qifpServer, EPADConfig.qifpPort);
			


		} catch (Throwable t) {
			log.warning("qifp wrapper: Failed invoking plugin", t);
			return false;
		}
		return true;
	}
	
	private void printErrorPage(Throwable throwable, PrintWriter out)
	{
		if (out != null) {
			out.println("ERROR");
			outputException(throwable, out);
			out.flush();
		}
	}
	
	private String buildFileUrl(String workflowId,String instanceID) {
		String fileBase="/qifp/v2/workflows/"+workflowId+"/instances/"+instanceID+"/files/?onlyFeatureResult=true&format=stream";
		return buildEPADBaseURL(EPADConfig.qifpServer, EPADConfig.qifpPort, fileBase);
		
		
	}
	
	private String[] getInfoOfInstance(String workflowId,String instanceID) {
		
		String[] info = runningPlugins.get(instanceID);
		if (info==null) {
			log.warning("Plugin "+ instanceID +" not saved as running, has no information about it!");
			//for testing
			info=new String[]{"69.831.5531915320.26123.862964462.28970358.604159.9166759.8.5141","dsotest","3DFeatureExtraction"};
			return info;
//			return null;
		}
		log.info("the plugin info:instanceID:"+instanceID+ " aimID:"+info[0]+" projectID:"+info[1]);
		return info;
	
	}
	
	public String updateName(String name) {
		Integer number=1;
		Integer index= name.lastIndexOf("-");
		try{
			
			number = Integer.parseInt(name.substring(index+1).trim());
			number++;
		}catch (Exception e) {}
		if (number!=1) {
			name=name.substring(0, index)+ "-"+number;
		}
		else 
			name=name+"-"+number;
		return name;
	}
	
	public void saveTheFeatures(String workflowId,String instanceID) {
		String[] info = getInfoOfInstance(workflowId, instanceID);
		Lexicon lex= Lexicon.getInstance();
		double featureVersion = 1.0;
		try {
			ImageAnnotationCollection imageAnnotationCollection = PluginAIMUtil.getImageAnnotationCollectionFromServer(info[0], info[1]);
			EPADSessionResponse session=getEPADSessionID(EPADConfig.qifpUserName, EPADConfig.qifpUserPass, EPADConfig.qifpServer, EPADConfig.qifpPort);
			try {
				//get features
				ArrayList<String[]> features = downloadFeaturesFromRemote(EPADConfig.qifpUserName,buildFileUrl( workflowId, instanceID), session.response);
				log.info("Number of features:"+features.size());
				//create a new unique id for the annotation
				//temporary. Do not create a new aim
//				log.info("new aimID:" + imageAnnotationCollection.refreshUniqueIdentifier());
				CD pluginLex=lex.get("99EPADP2");
				//set the template
				//the codevalue and codemeaning of template 
				CD typeCode = new CD("qifp","epad-plugin",pluginLex.getCodeSystemName(),pluginLex.getCodeSystemVersion());

				imageAnnotationCollection.getImageAnnotation().getListTypeCode().clear();
				imageAnnotationCollection.getImageAnnotation().addTypeCode(typeCode);
				//add the new features
				imageAnnotationCollection = PluginAIMUtil.addFeatures(imageAnnotationCollection, features, featureVersion, pluginLex );
				log.info("constructed aim:"+imageAnnotationCollection.toStringXML());
				//do not change the name
//				if (imageAnnotationCollection.getImageAnnotation().getName().getValue().contains(getName())){
//					String newName=updateName(imageAnnotationCollection.getImageAnnotation().getName().getValue());
//					imageAnnotationCollection.getImageAnnotation().getName().setValue(newName);
//				} 
//				else 
//					imageAnnotationCollection.getImageAnnotation().getName().setValue(imageAnnotationCollection.getImageAnnotation().getName().getValue()+" by "+ getName());
				//save the annotation
				//temporary update the old one don't create new
//				PluginAIMUtil.sendImageAnnotationToServer(imageAnnotationCollection, info[1], info[0]);
				PluginAIMUtil.sendImageAnnotationToServer(imageAnnotationCollection, info[1]);
				PluginAIMUtil.saveAnnotationToAnnotationsDirectory(imageAnnotationCollection);	
				log.info("done with plugin with instance id:"+instanceID);
				runningPlugins.remove(instanceID);
			} catch (Exception e) {
				log.warning("Download file failed ",e);
			}
		
		} catch (AimException e) {
			log.warning("Aim api throw an exception:",e);
		}
	
	}
	
	public static ArrayList<String[]> downloadFeaturesFromRemote(String username, String epadURL, String epadSessionID)
			throws Exception
	{
		ArrayList<String[]> list=null;
		HttpClient client = new HttpClient();
		GetMethod method = new GetMethod(epadURL);
		method.setRequestHeader("Cookie", "JSESSIONID=" + epadSessionID);
		int statusCode = 0;
		try {
			log.info("Calling remote epad " + epadURL);
			statusCode = client.executeMethod(method);
		} catch (Exception e) {
			log.warning("Exception calling ePAD", e);
			statusCode = HttpServletResponse.SC_INTERNAL_SERVER_ERROR;
		}
		File uploadStoreDir = new File(EPADConfig.getEPADWebServerUploadDir()
													+ "temp" + System.currentTimeMillis());
		uploadStoreDir.mkdirs();
		File zipfile = new File(uploadStoreDir, "epad.zip");
		long total = 0;
		if (statusCode == HttpServletResponse.SC_OK) {
			OutputStream outputStream = null;
			try {
				outputStream = new FileOutputStream(zipfile);
				InputStream inputStream = method.getResponseBodyAsStream();
				int read = 0;
				byte[] bytes = new byte[4096];
				while ((read = inputStream.read(bytes)) != -1) {
					outputStream.write(bytes, 0, read);
					total = total + read;
				}
			} finally {
				IOUtils.closeQuietly(outputStream);
				method.releaseConnection();
			}
			log.info("zip file path:"+zipfile.getAbsolutePath());
			EPADFileUtils.extractFolder(zipfile.getAbsolutePath());
			Collection<File> files=EPADFileUtils.getAllFilesWithExtension(uploadStoreDir,"csv",true);
			for (File file: files) //should be just the result features file
			{
				log.info("file:"+file.getName());
				list=addFeaturesToList(file);
			}
			log.debug("Remote EPAD download:" + total + " bytes");
		}
		else {
			log.warning("Remote EPAD URL:" + epadURL + " Status:" + statusCode);
		}
		//remove file so epad doesn't try to get it
		uploadStoreDir.delete();
		return list;
	}
	
	
	private static ArrayList<String[]> addFeaturesToList(File file) {
		ArrayList<String[]> list = new ArrayList<>();
		//read the lines and add to the list
		BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {
        	int i =0;
            br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {
            	if (++i>6){ //the first six lines are just patient and series information, skip them
            		 // use comma as separator
                    String[] feature = line.split(cvsSplitBy);

                    list.add(feature);
            	}
               

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
		return list;
	}
	
	/**
	 * Get the concurrent path if possible, otherwise get the absolute path.
	 * 
	 * @param file File
	 * @return String path of file. Concurrent path if possible.
	 */
	private static String getRealPath(File file)
	{
		try {
			return file.getCanonicalPath();
		} catch (IOException ioe) {
			return file.getAbsolutePath();
		}
	}


}